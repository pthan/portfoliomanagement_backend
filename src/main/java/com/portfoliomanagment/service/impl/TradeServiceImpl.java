package com.portfoliomanagment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.portfoliomanagment.models.Instruments;
import com.portfoliomanagment.models.Portfolio;
import com.portfoliomanagment.models.Positions;
import com.portfoliomanagment.repository.InstrumentsRepository;
import com.portfoliomanagment.repository.PortfolioRepository;
import com.portfoliomanagment.repository.PositionsRepository;
import com.portfoliomanagment.service.TradeService;

@Repository
public class TradeServiceImpl implements TradeService {
	
	Instruments instruments = new Instruments();
	Portfolio portfolio = new Portfolio();
	Positions position = new Positions();
	
	@Autowired
	private InstrumentsRepository instrumentRepo;
	
	@Autowired
	private PositionsRepository positionsRepo;
	
	@Autowired
	private PortfolioRepository portfolioRepo;
	
	public List<Portfolio> comparePortfolioValue(int instrumentId) {
		
		double percentage = 0;
		
		instruments =  instrumentRepo.retrieveByInstrumentId(instrumentId);
		portfolio = portfolioRepo.retrieveByCustId(0);
		
		// Calculate percentage from current portfolio and new portfolio
		percentage = (instruments.getInstrumentValue() - portfolio.getPortfolioValue()) * 0.01;
		position.setPercentage(percentage);
		
		return null;
	}
	
	public  List<Instruments> retrieveAllInstruments() {
		return instrumentRepo.findAll();
	}
	
	public void savePosition(Positions position) {
		positionsRepo.saveAndFlush(position);
	}
}
