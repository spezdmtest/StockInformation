package com.griddynamics.client;

import com.griddynamics.dto.CompanyDto;
import com.griddynamics.dto.StockDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;

public interface ExApiExchangeClient {
    Flux<CompanyDto> callToCompanyApi();
    Mono<StockDto> callToStockApi(String uri);

    URI getCompanyUri();

    String getStockUri(String symbol);
}
