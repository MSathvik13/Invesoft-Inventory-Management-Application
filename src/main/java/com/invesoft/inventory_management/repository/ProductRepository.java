package com.invesoft.inventory_management.repository;

import com.invesoft.inventory_management.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
