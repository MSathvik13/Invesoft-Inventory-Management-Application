package com.invesoft.inventory_management.service;

import com.invesoft.inventory_management.model.Stock;
import com.invesoft.inventory_management.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {
    @Autowired
    private StockRepository stockRepository;

    public  Stock addStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public List<Stock> getStockByProductId(String productId) {
        return stockRepository.findByProductId(productId);
    }

    public void deleteStock(String stockId) {
        stockRepository.deleteById(stockId);
    }
}
