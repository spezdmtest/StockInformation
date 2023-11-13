package com.griddynamics.stockinfo.mapper;

import com.griddynamics.stockinfo.dto.StockDto;
import com.griddynamics.stockinfo.entity.Stock;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-13T10:42:00+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.5 (Microsoft)"
)
@Component
public class StockMapperImpl implements StockMapper {

    @Override
    public StockDto mapToStock(Stock stock) {
        if ( stock == null ) {
            return null;
        }

        Long id = null;
        String symbol = null;
        BigDecimal latestPrice = null;
        BigDecimal change = null;
        Integer previousVolume = null;
        Integer volume = null;
        String companyName = null;

        id = stock.getId();
        symbol = stock.getSymbol();
        latestPrice = stock.getLatestPrice();
        change = stock.getChange();
        previousVolume = stock.getPreviousVolume();
        volume = stock.getVolume();
        companyName = stock.getCompanyName();

        StockDto stockDto = new StockDto( id, symbol, latestPrice, change, previousVolume, volume, companyName );

        return stockDto;
    }

    @Override
    public Stock mapToStockDto(StockDto stockDto) {
        if ( stockDto == null ) {
            return null;
        }

        Stock.StockBuilder stock = Stock.builder();

        stock.id( stockDto.id() );
        stock.symbol( stockDto.symbol() );
        stock.latestPrice( stockDto.latestPrice() );
        stock.change( stockDto.change() );
        stock.previousVolume( stockDto.previousVolume() );
        stock.volume( stockDto.volume() );
        stock.companyName( stockDto.companyName() );

        return stock.build();
    }
}
