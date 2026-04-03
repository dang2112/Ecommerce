package com.dacnpm.ecommerce.model;

import java.util.concurrent.atomic.AtomicLong;

public class Product {
    private static final AtomicLong NEXT_ID = new AtomicLong(0);
    private final long id = NEXT_ID.getAndIncrement(); //this will probably be changed for UUID
    private String name;
    private double price;
    private String description;

    public Product() {
        this.name = "empty";
        this.price = 0.0;
        this.description = "placeholder.";
    }

    public Product(String name, double price, String desc) {
        this.name = name;
        this.price = price;
        this.description = desc;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }
}
