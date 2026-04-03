package com.dacnpm.ecommerce.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dacnpm.ecommerce.model.Cart;
import com.dacnpm.ecommerce.model.Product;
import com.dacnpm.ecommerce.repo.ProductRepository;

@Controller
@SessionAttributes("cart")
public class CartController {

    @Autowired
    private ProductRepository repo;

    @ModelAttribute("cart")
    public Cart cart() {
        return new Cart();
    }

    @PostMapping("/cart/add/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute("cart") Cart cart) {

        Product product = repo.findById(id);
        if (product == null) {
            return "redirect:/";
        }
        cart.addProduct(product);

        return "redirect:/";
    }
}
