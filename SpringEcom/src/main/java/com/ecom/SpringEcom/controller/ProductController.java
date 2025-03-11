package com.ecom.SpringEcom.controller;

import com.ecom.SpringEcom.model.Product;
import com.ecom.SpringEcom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> addProduct(@PathVariable("id") int id){
        Product product = productService.getProductById(id);
        if(product.getId() > 0){
            return new ResponseEntity<>(product, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
}
