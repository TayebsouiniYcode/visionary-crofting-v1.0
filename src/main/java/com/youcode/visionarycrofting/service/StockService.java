package com.youcode.visionarycrofting.service;


import com.youcode.visionarycrofting.entity.Stock;
import com.youcode.visionarycrofting.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockService {
    @Autowired
    StockRepository stockRepository;
    public List<Stock> findAll(){
        return stockRepository.findAll();
    }

    public Stock insertStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public void deleteStockById(Long id) {
        boolean exist = stockRepository.existsById(id);
        if(!exist){
            throw new IllegalStateException("stock with id "+ id + " does not exist");
        }
        stockRepository.deleteById(id);
    }


    public Optional<Stock> findById(Long id){
        return stockRepository.findById(id);
    }

    public void updateStock(Stock stock) {
//        if(stockRepository.existsById(id)){

            stockRepository.save(stock);

//        }
    }
}
