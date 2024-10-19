package com.example.cart_service.repository;

import com.example.cart_service.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
    // Métodos personalizados si es necesario
}
