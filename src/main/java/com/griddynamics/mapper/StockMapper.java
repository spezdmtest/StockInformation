package com.griddynamics.mapper;

import com.griddynamics.dto.StockDto;
import com.griddynamics.entity.Stock;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StockMapper {

    StockDto mapToStock(Stock stock);

    @InheritInverseConfiguration
    Stock mapToStockDto(StockDto stockDto);
}
