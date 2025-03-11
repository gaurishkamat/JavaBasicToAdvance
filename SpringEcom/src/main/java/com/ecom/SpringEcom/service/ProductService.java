package com.ecom.SpringEcom.service;

import com.ecom.SpringEcom.model.Product;
import com.ecom.SpringEcom.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {
        System.out.println("Here");
        return productRepo.findAll();
    }

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public Product getProductById(int id) {
        return productRepo.findById(id).orElse(new Product(-1));
    }
}
