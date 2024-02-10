package com.example.demo.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table( name = " DetailComposant ")

public class DetailComposant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    @Column(name=" idDetailComposant" )
    private Long idDetailComposant ; // Clé primaire
    private Float imc ;
    private TypeComposant typeComposant ;
    // Constructeur et accesseurs (getters) et mutateurs (setters)
}