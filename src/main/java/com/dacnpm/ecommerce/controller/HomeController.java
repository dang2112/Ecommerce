package com.dacnpm.ecommerce.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dacnpm.ecommerce.repo.ProductRepository;

@Controller
public class HomeController {

    @Autowired
    private ProductRepository repo;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("products", repo.findAll());
        return "home";
    }
}
