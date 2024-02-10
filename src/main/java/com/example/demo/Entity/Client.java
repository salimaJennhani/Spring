package com.example.demo.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = " Client ")

public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    @Column(name=" idClient" )
    private Long idClient ; // Clé primaire
    private String identifiant ;
    @Temporal(TemporalType.DATE)
    private Date datePremiereVisite ;
}
