package com.griddynamics.repository;

import com.griddynamics.entity.Company;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends R2dbcRepository<Company, Integer> {
}
