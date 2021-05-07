package com.aprendendo.spring.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aprendendo.spring.dsvendas.dto.SaleSuccessDTO;
import com.aprendendo.spring.dsvendas.dto.SaleSumDTO;
import com.aprendendo.spring.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT new com.aprendendo.spring.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) FROM Sale as obj GROUP BY obj.seller")
	public List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.aprendendo.spring.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) FROM Sale as obj GROUP BY obj.seller")
	public List<SaleSuccessDTO> successGroupedBySeller();
}
