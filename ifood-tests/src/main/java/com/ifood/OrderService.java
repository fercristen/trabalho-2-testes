package com.ifood;

import java.util.List;

public class OrderService {
    public boolean validateCartStock(List<ShoppingCartService.CartItem> items) {
        for (ShoppingCartService.CartItem item : items) {
            if (item.product.getStock() < item.quantity) {
                return false;
            }
        }
        return true;
    }
}
