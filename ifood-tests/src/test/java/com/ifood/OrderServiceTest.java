package com.ifood;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrderServiceTest {
    @Test
    void validarEstoqueInsuficienteFalha() {
        Product p = new Product("Pao", "desc", 0);
        ShoppingCartService cart = new ShoppingCartService("user1");
        cart.addItem(p, 1);
        OrderService service = new OrderService();
        boolean result = service.validateCartStock(cart.getItems());
        assertFalse(result);
    }

    @Test
    void validarEstoqueSuficiente() {
        Product p = new Product("Pao", "desc", 5);
        ShoppingCartService cart = new ShoppingCartService("user1");
        cart.addItem(p, 1);
        OrderService service = new OrderService();
        assertTrue(service.validateCartStock(cart.getItems()));
    }
}
