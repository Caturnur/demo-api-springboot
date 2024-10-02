package com.domain.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.models.entities.Product;
import com.domain.models.repos.ProductRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productrepo;

    public Product save(Product product) {
        return productrepo.save(product);
    }

    public Product findOne(Long id) {
        Optional<Product> product = productrepo.findById(id);
        if (!product.isPresent()) {
            return null;
        }
        return product.get();
    }

    public Iterable<Product> findAll() {
        return productrepo.findAll();
    }

    public void removeOne(Long id) {
        productrepo.deleteById(id);
    }

    public List<Product> findByName(String name) {
        return productrepo.findByNameContains(name);
    }

}
