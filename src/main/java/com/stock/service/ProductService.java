package com.stock.service;


import com.stock.model.entity.Product;
import com.stock.repository.ProductRepository;
import jakarta.transaction.Transactional;
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
    public Product findById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public Product save(Product product){
       return repository.save(product);
    }

    @Transactional
    public void updateName(Product product, Long id){

        Product productExisting = repository.findById(id).orElseThrow();
        productExisting.setName(product.getName());
        productExisting.setTotalProduct(product.getTotalProduct());
        productExisting.setPrice(product.getPrice());
        productExisting.setDescription(product.getDescription());
        productExisting.setSKU(product.getSKU());
        productExisting.setQtdArea(product.getQtdArea());
        productExisting.setQuantityStock(product.getQuantityStock());
        repository.save(productExisting);
    }

    @Transactional
    public void delete(Long id){
        Product product1 = repository.findById(id).orElseThrow();
        repository.delete(product1);

    }







}
