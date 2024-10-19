package com.example.cart_service.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId; // Identificador del usuario
    @OneToMany(cascade = CascadeType.ALL)
    private List<CartItem> items; // Items en el carrito

    // Getters y Setters
}

