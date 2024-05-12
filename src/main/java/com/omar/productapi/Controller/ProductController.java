package com.omar.productapi.Controller;

import com.omar.productapi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.omar.productapi.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public Product getProduct(){

        return productService.getProduct();
    }
}

