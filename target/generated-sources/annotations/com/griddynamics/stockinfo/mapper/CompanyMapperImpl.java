package com.griddynamics.stockinfo.mapper;

import com.griddynamics.stockinfo.dto.CompanyDto;
import com.griddynamics.stockinfo.entity.Company;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-13T10:42:00+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.5 (Microsoft)"
)
@Component
public class CompanyMapperImpl implements CompanyMapper {

    @Override
    public CompanyDto mapToCompany(Company company) {
        if ( company == null ) {
            return null;
        }

        Integer id = null;
        String symbol = null;

        id = company.getId();
        symbol = company.getSymbol();

        Boolean isEnabled = null;

        CompanyDto companyDto = new CompanyDto( id, symbol, isEnabled );

        return companyDto;
    }

    @Override
    public Company mapToCompanyDto(CompanyDto companyDto) {
        if ( companyDto == null ) {
            return null;
        }

        Company.CompanyBuilder company = Company.builder();

        company.id( companyDto.id() );
        company.symbol( companyDto.symbol() );

        return company.build();
    }
}
