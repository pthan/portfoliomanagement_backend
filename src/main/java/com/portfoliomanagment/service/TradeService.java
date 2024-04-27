package com.portfoliomanagment.service;

import java.util.List;

import com.portfoliomanagment.models.Instruments;
import com.portfoliomanagment.models.Portfolio;
import com.portfoliomanagment.models.Positions;

public interface TradeService {
	
	public List<Portfolio> comparePortfolioValue(int instrumentId);
	
	public  List<Instruments> retrieveAllInstruments();
	
	public void savePosition(Positions position);
}
