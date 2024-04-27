package com.portfoliomanagment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "instruments")
public class Instruments {
	
	public enum InstrumentType {
		Bond, DigitalAsset, RealEstate
	}

	private int instrumentId;
	private String instrumentName;
	private String instrumentValue;
	private InstrumentType instrumentType;

	public int getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(int instrumentId) {
		this.instrumentId = instrumentId;
	}

	public String getInstrumentName() {
		return instrumentName;
	}

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

	public String getInstrumentValue() {
		return instrumentValue;
	}

	public void setInstrumentValue(String instrumentValue) {
		this.instrumentValue = instrumentValue;
	}

	public InstrumentType getInstrumentType() {
		return instrumentType;
	}

	public void setInstrumentType(InstrumentType instrumentType) {
		this.instrumentType = instrumentType;
	}

}
