package com.example.demo.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table( name = " Menu ")
public class Menu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    @Column(name=" idMenu" )
    private Long idMenu ; // Clé primaire
    private String libelleMenu ;
    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu ;
    private Float prixTotal ;
    // Constructeur et accesseurs (getters) et mutateurs (setters)
    @ManyToMany
    private ArrayList<ChefCuisinier> chefCuisinier;
    @OneToMany(mappedBy = "menu")
    private ArrayList<Commande> commandes;
    @OneToMany(mappedBy = "menu")
    private ArrayList<Composant> Composants;
}
