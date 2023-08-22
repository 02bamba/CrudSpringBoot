package com.example.produit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.produit.Model.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Long>{
    
}
