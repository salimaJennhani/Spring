package com.example.demo.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table( name = " ChaineRestauration ")
public class ChaineRestauration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    @Column(name=" idChaineRestauration" )
    private Long idChaineRestauration ; // Clé primaire
    private String libelle ;
    private LocalDate dateCreation ;
}
