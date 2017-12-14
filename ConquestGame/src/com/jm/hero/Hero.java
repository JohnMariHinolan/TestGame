package com.jm.hero;

import java.util.List;

import com.jm.card.Card;
import com.jm.card.obj.unit.Unit;
import com.jm.config.CurrencyTypeEnum;
import com.jm.currency.Currency;
import com.jm.obj.ability.Ability;
import com.jm.victoryco.VictoryCondition;

public class Hero extends Card{

	private int heroHp;
	

	private List<Currency> currencyList;

	private List<Unit> availableUnit ;
	
	private List<VictoryCondition> victoryConditionList;
	
	private List<Ability> heroAbilityList;
	
	//private List<>
	
	//public abstract void build();
	
	public void draw(int turnNum) {
		
	}

	public int getHeroHp() {
		return heroHp;
	}

	public void setHeroHp(int heroHp) {
		this.heroHp = heroHp;
	}

	public List<Unit> getAvailableUnit() {
		return availableUnit;
	}

	public void setAvailableUnit(List<Unit> availableUnit) {
		this.availableUnit = availableUnit;
	}

	public List<VictoryCondition> getVictoryConditionList() {
		return victoryConditionList;
	}

	public void setVictoryConditionList(List<VictoryCondition> victoryConditionList) {
		this.victoryConditionList = victoryConditionList;
	}

	public List<Ability> getHeroAbilityList() {
		return heroAbilityList;
	}

	public void setHeroAbilityList(List<Ability> heroAbilityList) {
		this.heroAbilityList = heroAbilityList;
	}

	public void addCurrency(Currency currency) {
		
		currencyList.add(currency);
	}
	
	public void addAmount(CurrencyTypeEnum currencyTypeEnum ,double amount) {
		// trigger 
		Currency cur =currencyList.stream().filter(	(Currency c) -> {
			return c.getCurrencyTypeEnum() == currencyTypeEnum;
			
		}).findFirst().get();
		
	
		cur.addAmount(amount);
		
	}
	
	public void minusAmount(CurrencyTypeEnum currencyTypeEnum ,double amount) {
		// trigger 
		
		Currency cur =currencyList.stream().filter(	(Currency c) -> {
			return c.getCurrencyTypeEnum() == currencyTypeEnum;
			
		}).findFirst().get();
		
	
		cur.minusAmount(amount);
			}
	
	public boolean canBuy(CurrencyTypeEnum currencyTypeEnum  , double amount) {
		Currency cur =currencyList.stream().filter(	(Currency c) -> {
			return c.getCurrencyTypeEnum() == currencyTypeEnum;
			
		}).findFirst().get();
		
	
		return cur.canBuy(amount);
	}
	
	
}
