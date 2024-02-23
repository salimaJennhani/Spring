package com.example.demo.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
@Table( name = " ChaineRestauration ")
public class ChaineRestauration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    @Column(name=" idChaineRestauration" )
    private Long idChaineRestauration ; // Clé primaire
    private String libelle ;
    private LocalDate dateCreation ;
    @OneToMany(mappedBy = "chaineRestauration")
    ArrayList<Restaurant> restaurants;

}
