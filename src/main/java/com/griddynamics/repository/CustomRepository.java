package com.griddynamics.repository;

import com.griddynamics.entity.Company;
import com.griddynamics.entity.Stock;
import reactor.core.publisher.Mono;

public interface CustomRepository {
    Mono<Company> save(Company company);
    Mono<Stock> saveStock(Stock stock);
}
