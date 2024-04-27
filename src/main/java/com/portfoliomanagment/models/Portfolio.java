package com.portfoliomanagment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "portfolio")
public class Portfolio {
	
	public enum InvestStrategyType {
		Safe, Moderate, Risky
	}

	private int id;
	private String portfolioNo;
	private String portfolioValue;
	private String currentPerformance;
	private InvestStrategyType investmentStrategy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPortfolioNo() {
		return portfolioNo;
	}

	public void setPortfolioNo(String portfolioNo) {
		this.portfolioNo = portfolioNo;
	}

	public String getPortfolioValue() {
		return portfolioValue;
	}

	public void setPortfolioValue(String portfolioValue) {
		this.portfolioValue = portfolioValue;
	}

	public String getCurrentPerformance() {
		return currentPerformance;
	}

	public void setCurrentPerformance(String currentPerformance) {
		this.currentPerformance = currentPerformance;
	}

	public InvestStrategyType getInvestmentStrategy() {
		return investmentStrategy;
	}

	public void setInvestmentStrategy(InvestStrategyType investmentStrategy) {
		this.investmentStrategy = investmentStrategy;
	}

}
