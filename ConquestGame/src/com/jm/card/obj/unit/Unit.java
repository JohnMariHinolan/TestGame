package com.jm.card.obj.unit;

import java.util.List;

import com.jm.card.Card;
import com.jm.cardexp.CardExp;
import com.jm.config.RaceEnum;
import com.jm.obj.ability.Ability;
import com.jm.obj.status.Status;

public class Unit extends Card {

	protected Unit() {};
	
	private int attack;
	private int def;
	private boolean move;
	private RaceEnum race;
	// modify by 
	private CardExp cardExp;
	private List<Ability> cardAbilities;
	private List<Status> cardStatus;
	
	private int maintenanceCost;
	
	
	
	public CardExp getCardExp() {
		return cardExp;
	}
	public void setCardExp(CardExp cardExp) {
		this.cardExp = cardExp;
	}
	public int getAttack() {
		return attack;
	}
	public Unit setAttack(int attack) {
		this.attack = attack;
		return this;
	}
	public int getDef() {
		return def;
	}
	public Unit setDef(int def) {
		this.def = def;
		return this;
	}
	public boolean isMove() {
		return move;
	}
	public Unit setMove(boolean move) {
		this.move = move;
		return this;
	}
	public RaceEnum getRace() {
		return race;
	}
	public Unit setRace(RaceEnum race) {
		this.race = race;
		return this;
	}
	public List<Ability> getCardAbilities() {
		return cardAbilities;
	}
	public Unit setCardAbilities(List<Ability> cardAbilities) {
		this.cardAbilities = cardAbilities;
		return this;
	}
	
	
	
	
	public List<Status> getCardStatus() {
		return cardStatus;
	}
	public Unit setCardStatus(List<Status> cardStatus) {
		this.cardStatus = cardStatus;
		return this;
	}
	
	public Unit putName(String name) {
		super.setName(name);
		return this;
	}
	@Override
	public String toString() {
		return "Name: " +super.getName() +" Unit [race=" + race + "] ";
	}
	
	public boolean isSameType(RaceEnum race) {
		return this.race == race;
		
	}
	public int getMaintenanceCost() {
		return maintenanceCost;
	}
	public void setMaintenanceCost(int maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}  
	
	
	@Override
	public void destroy() {
		
		reset() ;
	
	}
	
	private void reset() {
		
		
	}
	
}
