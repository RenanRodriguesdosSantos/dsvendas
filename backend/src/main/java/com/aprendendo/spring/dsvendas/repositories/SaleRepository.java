package com.aprendendo.spring.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendo.spring.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
