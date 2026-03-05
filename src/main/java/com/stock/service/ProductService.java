package com.stock.service;


import com.stock.model.entity.Product;
import com.stock.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository repository;

    public ProductService(ProductRepository repository){
        this.repository = repository;
    }

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product save(Product product){
       return repository.save(product);
    }






}
