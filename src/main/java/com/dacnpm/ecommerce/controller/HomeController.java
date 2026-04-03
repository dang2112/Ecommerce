package com.dacnpm.ecommerce.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dacnpm.ecommerce.model.Cart;
import com.dacnpm.ecommerce.repo.ProductRepository;

@Controller
@SessionAttributes("cart")
public class HomeController {

    @Autowired
    private ProductRepository repo;

    @ModelAttribute("cart")
    public Cart cart() {
        return new Cart();
    }
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("products", repo.findAll());
        return "home";
    }
}
