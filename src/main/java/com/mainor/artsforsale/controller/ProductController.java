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
    @GetMapping("/concatenate")
    public String concatenateStrings(@RequestParam("str1") String str1, @RequestParam("str2") String str2) {
        String result = str1 +" "+ str2;
        return result;
    }

    @GetMapping("/getAll")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

}
