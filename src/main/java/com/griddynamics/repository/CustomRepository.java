package com.griddynamics.repository;

import com.griddynamics.entity.Company;
import com.griddynamics.entity.Stock;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface CustomRepository {
    Mono<Company> save(Company company);
    Mono<Stock> saveStock(Stock stock);
}
