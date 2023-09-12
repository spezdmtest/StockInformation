package com.griddynamics.service;

import com.griddynamics.client.ExApiExchangeClientImpl;
import com.griddynamics.mapper.CompanyMapper;
import com.griddynamics.mapper.StockMapper;
import com.griddynamics.repository.CustomRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@Service
@RequiredArgsConstructor
public class DataProcessingServiceImpl implements DataProcessingService{

    @Value("${service.number-of-companies}")
    private Integer NUMBER_OF_COMPANIES;
    private final List<String> tasks = new CopyOnWriteArrayList<>();
    private AtomicInteger index = new AtomicInteger();

    private final ExApiExchangeClientImpl apiClient;
    private final CompanyMapper companyMapper;
    private final StockMapper stockMapper;
    private final CustomRepository customRepository;
    @Override
    public Mono<Void> processingCompanyData() {
        return null;
    }

    @Override
    public Mono<Void> processingStockData() {
        return null;
    }
}
