package com.example.demo.controllers;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.InhousePartService;
import com.example.demo.service.InhousePartServiceImpl;
import com.example.demo.service.PartService;
import com.example.demo.service.PartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Optional;
/**
 *
 *
 *
 *
 */
@Controller
public class BuyingProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/buyingProduct")
    public String buyingProduct(@RequestParam("productId") Long productId, Model theModel) {
        Optional<Product> buyingProduct = productRepository.findById(productId);

        if (buyingProduct.isPresent()) {
            Product product = buyingProduct.get();
            if (product.getInv() > 0) {
                product.setInv(product.getInv() - 1);
                productRepository.save(product);
                return "buyingSuccess";
            } else {
                return "buyingFail";
            }
        } else {
            return "buyingFail";
        }
    }
}

