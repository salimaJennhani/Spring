package com.example.demo.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table( name = " Restaurant ")
public class Restaurant  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    @Column(name=" idRestaurant" )
    private Long idRestaurant ; // Clé primaire
    private String nom ;
    private Long nbPlacesMax ;
    // Constructeur et accesseurs (getters) et mutateurs (setters)
    @ManyToOne
    ChaineRestauration chaineRestauration;
    @OneToMany
    ArrayList<Menu> menus;
}
