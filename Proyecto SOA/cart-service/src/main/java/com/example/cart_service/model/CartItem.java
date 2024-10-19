package com.example.cart_service.model;

import javax.persistence.*;

@Entity
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId; // Identificador del producto
    private int quantity; // Cantidad del producto

    // Getters y Setters
}
