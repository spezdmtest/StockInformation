package com.griddynamics.mapper;

import com.griddynamics.dto.CompanyDto;
import com.griddynamics.entity.Company;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyMapper {

    CompanyDto mapToCompany(Company company);

    @InheritInverseConfiguration
    Company mapToCompanyDto(CompanyDto companyDto);
}
