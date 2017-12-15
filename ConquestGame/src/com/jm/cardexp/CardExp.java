package com.jm.cardexp;

public class CardExp {

	
	private int expForNextLvl = 100;
	private int currentExp = 0;
	private int passiveExpRate = 2;
	
	private void addExp(int exp) {
		this.currentExp += exp;
	}
	
	// signalsl that card is ready for level up
	public boolean addAndCheck(int exp) {
		addExp(exp);
		
		boolean isEnough = (expForNextLvl <= currentExp);
		
		if(isEnough) {// reset
			currentExp = currentExp - expForNextLvl;
			return true;
		}
		
		return false;
	}

	public int getExpForNextLvl() {
		return expForNextLvl;
	}

	public void setExpForNextLvl(int expForNextLvl) {
		this.expForNextLvl = expForNextLvl;
	}

	public int getCurrentExp() {
		return currentExp;
	}

	public void setCurrentExp(int currentExp) {
		this.currentExp = currentExp;
	}

	public int getPassiveExpRate() {
		return passiveExpRate;
	}

	public void setPassiveExpRate(int passiveExpRate) {
		this.passiveExpRate = passiveExpRate;
	}
	
	
}
