package com.dacnpm.ecommerce.model;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private final Map<Long, CartItem> items = new HashMap<>();

    public void addProduct(Product product) {
        if (items.containsKey(product.getId())) {
            items.get(product.getId()).increase();
        } else {
            items.put(product.getId(), new CartItem(product));
        }
    }

    public int getTotalQuantity() {
        return items.values().stream().mapToInt(CartItem::getQuantity).sum();
    }

    public Collection<CartItem> getItems() {
        return items.values();
    }
}
