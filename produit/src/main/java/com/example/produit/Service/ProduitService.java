package com.example.produit.Service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.produit.Model.Produit;
import com.example.produit.Repository.ProduitRepository;

@Service
public class ProduitService {
    private final ProduitRepository produitRepository;
    public ProduitService(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    public List<Produit> getAllProduits(){
        return produitRepository.findAll();
    }
    public Produit AddProduit(Produit produit){
        return produitRepository.save(produit);
    }
    
    public Produit FindProduitById(Long id){
        return produitRepository.FindProduitById(id);
    } 

}
