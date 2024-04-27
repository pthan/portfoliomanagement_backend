package com.portfoliomanagment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfoliomanagment.models.Portfolio;

@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, String> {
	
	Portfolio retrieveByCustId(int custId);
	
	List<Portfolio> retrieveAllByCustId(String custId);
}

