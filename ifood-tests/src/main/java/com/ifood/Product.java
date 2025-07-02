package com.ifood;

import java.util.Arrays;
import java.util.List;

public class Product {
    private final String name;
    private final String description;
    private final List<String> tags;
    private int stock;

    public Product(String name, String description, int stock, String... tags) {
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.tags = Arrays.asList(tags);
    }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public List<String> getTags() { return tags; }

    public int getStock() { return stock; }

    public void setStock(int stock) { this.stock = stock; }
}
