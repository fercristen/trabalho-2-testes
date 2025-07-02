package com.ifood;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartServiceTest {
    @Test
    void cartPersistsAfterNewInstance() {
        Product p = new Product("Pao", "desc", 10);
        ShoppingCartService cart1 = new ShoppingCartService("user1");
        cart1.addItem(p, 1);
        ShoppingCartService cart2 = new ShoppingCartService("user1");
        assertEquals(1, cart2.getItems().size());
    }
}
