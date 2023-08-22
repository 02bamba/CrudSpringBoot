package com.example.produit.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.produit.Model.Produit;
import com.example.produit.Service.ProduitService;

@RestController
@RequestMapping("/Produit")
public class ProduitController {
    private final ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }
    @GetMapping("/all")
    public List<Produit> getProduit(){
        return produitService.getAllProduits();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Produit> getProduitById(@PathVariable("id") Long id){
       Produit produit = produitService.FindProduitById(id);
       return new ResponseEntity<>(produit, HttpStatus.OK);
    }
}
