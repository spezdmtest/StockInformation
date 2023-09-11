package com.griddynamics.dto;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public record StockDto(@Id Long id, String symbol, BigDecimal latestPrice, BigDecimal change,
                       Integer previousVolume, String companyName) {
}
