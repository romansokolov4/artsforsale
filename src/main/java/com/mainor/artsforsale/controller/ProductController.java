package com.mainor.artsforsale.controller;

import com.mainor.artsforsale.model.Product;
import com.mainor.artsforsale.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public String add(@RequestBody Product product) {
        productService.saveProduct(product);
        return "New product is added";
    }
    @GetMapping("/name")
    public String concatenateStrings(@RequestParam("firstName") String str1, @RequestParam("lastName") String str2) {
        String fullName = str1 +" "+ str2;
        return fullName;
    }

    @GetMapping("/getAll")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

}
