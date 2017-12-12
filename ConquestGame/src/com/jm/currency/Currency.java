package com.jm.currency;

import com.jm.config.CurrencyTypeEnum;

public class Currency {

	private CurrencyTypeEnum currencyTypeEnum;
	private double amount = 0;
	
	public void addAmount(double amount) {
		// trigger 
		this.amount+= amount;
	}
	
	public void minusAmount(double amount) {
		// trigger 
		this.amount-= amount;
	}
	
	public boolean canBuy(double amount) {
		return this.amount < amount;
	}
	
	public CurrencyTypeEnum getCurrencyTypeEnum() {
		return currencyTypeEnum;
	}
	public void setCurrencyTypeEnum(CurrencyTypeEnum currencyTypeEnum) {
		this.currencyTypeEnum = currencyTypeEnum;
	}
	public double getAmount() {
		return  amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
