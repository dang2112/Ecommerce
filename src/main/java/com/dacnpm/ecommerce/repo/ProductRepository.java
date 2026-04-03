package com.dacnpm.ecommerce.repo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dacnpm.ecommerce.model.Product;

@Repository
public class ProductRepository {
    private static final List<Product> products = new ArrayList<>();

    static {
        products.add(new Product("iPhone", 1000, "Apple phone"));
        products.add(new Product("Laptop", 1500, "Gaming laptop"));
        products.add(new Product("Headphone", 200, "Noise cancelling"));
    }

    public List<Product> findAll() {
        return products;
    }

    public Product findById(Long id) {
        return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
}