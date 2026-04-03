package com.dacnpm.ecommerce.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dacnpm.ecommerce.model.Product;
import com.dacnpm.ecommerce.repo.ProductRepository;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @GetMapping("/product/{id}")
    public String detail(@PathVariable Long id, Model model) {
        Product product = repo.findById(id);
        model.addAttribute("product", product);
        return "product-detail";
    }
}
