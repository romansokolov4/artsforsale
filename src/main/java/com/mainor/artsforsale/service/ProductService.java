package com.mainor.artsforsale.service;

import com.mainor.artsforsale.model.Product;

import java.util.List;

public interface ProductService {

    public Product saveProduct(Product product);
    public List<Product> getAllProduct();
}
