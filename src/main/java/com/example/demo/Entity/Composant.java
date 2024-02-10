package com.example.demo.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table( name = " Composant ")

public class Composant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    @Column(name=" idComposant" )
    private Long idComposant ; // Clé primaire
    private String nomComposant ;
    private Float prix ;
    // Constructeur et accesseurs (getters) et mutateurs (setters)
}