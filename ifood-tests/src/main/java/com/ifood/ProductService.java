package com.ifood;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ProductService {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> searchProducts(String term) {
        String t = term.toLowerCase(Locale.ROOT);
        return products.stream()
                .filter(p -> p.getName().toLowerCase(Locale.ROOT).contains(t)
                        || p.getDescription().toLowerCase(Locale.ROOT).contains(t)
                        || p.getTags().stream().anyMatch(tag -> tag.toLowerCase(Locale.ROOT).contains(t)))
                .collect(Collectors.toList());
    }

    public List<Product> getProducts() { return products; }
}
