package com.portfoliomanagment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfoliomanagment.models.Instruments;

@Repository
public interface InstrumentsRepository extends JpaRepository<Instruments, Integer> {

	Instruments retrieveByInstrumentId(int instrumentId);
	
	List<Instruments> retrieveAllByInstrumentId(int instrumentId);
}
