package com.invesoft.inventory_management.repository;

import com.invesoft.inventory_management.model.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StockRepository extends MongoRepository<Stock, String> {
    List<Stock> findByProductId(String productId);
//    void deleteStocksByProductId(String productId);
}
