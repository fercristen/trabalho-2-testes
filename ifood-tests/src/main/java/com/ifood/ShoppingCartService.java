package com.ifood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCartService {
    private static final Map<String, List<CartItem>> persistence = new HashMap<>();

    private final String userId;
    private final List<CartItem> items;

    public ShoppingCartService(String userId) {
        this.userId = userId;
        this.items = persistence.getOrDefault(userId, new ArrayList<>());
    }

    public void addItem(Product product, int qty) {
        items.add(new CartItem(product, qty));
        persistence.put(userId, items);
    }

    public List<CartItem> getItems() {
        return new ArrayList<>(items);
    }

    public void clear() {
        items.clear();
        persistence.put(userId, items);
    }

    public static class CartItem {
        public final Product product;
        public final int quantity;
        public CartItem(Product p, int q) {
            this.product = p; this.quantity = q;
        }
    }
}
