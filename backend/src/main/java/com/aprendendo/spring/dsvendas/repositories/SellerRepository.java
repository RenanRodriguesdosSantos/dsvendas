package com.aprendendo.spring.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendo.spring.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
