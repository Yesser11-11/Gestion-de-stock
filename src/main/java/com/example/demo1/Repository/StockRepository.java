package com.example.demo1.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo1.model.Stock;

public interface StockRepository extends CrudRepository<Stock, Integer> {

}
