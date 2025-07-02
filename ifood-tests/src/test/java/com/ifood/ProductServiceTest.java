package com.ifood;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {
    private ProductService service;

    @BeforeEach
    void setup() {
        service = new ProductService();
        service.addProduct(new Product("Pao", "Pao frances crocante", 5, "padaria", "crocante"));
        service.addProduct(new Product("Bolo", "Bolo de chocolate", 3, "confeitaria"));
    }

    @Test
    void buscarPorNomeExato() {
        List<Product> res = service.searchProducts("Pao");
        assertFalse(res.isEmpty());
        assertEquals("Pao", res.get(0).getName());
    }

    @Test
    void buscarPorDescricao() {
        List<Product> res = service.searchProducts("crocante");
        assertEquals(1, res.size());
    }
}
