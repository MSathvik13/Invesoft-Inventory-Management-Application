package com.invesoft.inventory_management.controller;

import com.invesoft.inventory_management.model.Stock;
import com.invesoft.inventory_management.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stocks")
public class StockController {
    @Autowired
    private StockService stockService;

    @PostMapping
    public Stock addStock(@RequestBody Stock stock) {
        return stockService.addStock(stock);
    }

    @GetMapping("product/{productId}")
    public List<Stock> getStocksByProductId(@PathVariable String productId) {
        return stockService.getStockByProductId(productId);
    }

    @DeleteMapping("{stockId}")
    public void deleteStocksByStockId(@PathVariable String stockId) {
        stockService.deleteStock(stockId);
    }
}
