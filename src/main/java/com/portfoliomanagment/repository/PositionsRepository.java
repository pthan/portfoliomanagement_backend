package com.portfoliomanagment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfoliomanagment.models.Positions;

@Repository
public interface PositionsRepository extends JpaRepository<Positions, String> {
	
	List<Positions> retrieveBycustId(String custId);
	
	List<Positions> retrieveBycustIdAndInstrumentId(String custId, int instrumentId);
}
