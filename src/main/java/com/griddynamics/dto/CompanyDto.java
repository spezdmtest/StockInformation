package com.griddynamics.dto;

import org.springframework.data.annotation.Id;

public record CompanyDto(@Id Integer id, String symbol, Boolean isEnable) {
}
