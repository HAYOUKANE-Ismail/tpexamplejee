package com.example.exampletp.repository;

import com.example.exampletp.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> { }
