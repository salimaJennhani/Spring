package com.example.demo.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
@Entity
@Table( name = " Commande ")

public class Commande  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    @Column(name=" idCommande" )
    private Long idCommande ; // Clé primaire
    private LocalDate dateCommande ;
    private Integer pourcentageRemise ;
    private Float totalRemise;
    private Float totalCommande;
    private Long note;
    // Constructeur et accesseurs (getters) et mutateurs (setters)
    @ManyToOne
    Client client;
    @ManyToOne
    Menu menu;
}