package com.jm.card.obj.bldg;

import java.util.List;

import com.jm.card.Card;
import com.jm.config.RaceEnum;
import com.jm.config.TerrainEnum;
import com.jm.obj.ability.Ability;
import com.jm.obj.status.Status;

public class Building extends Card {

	protected Building() {};
	
	
	private int def;
	
	private RaceEnum race;
	private List<Ability> cardAbilities;
	private List<Status> cardStatus;
	
	private int maintenanceCost;

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}


	public RaceEnum getRace() {
		return race;
	}

	public void setRace(RaceEnum race) {
		this.race = race;
	}

	public List<Ability> getCardAbilities() {
		return cardAbilities;
	}

	public void setCardAbilities(List<Ability> cardAbilities) {
		this.cardAbilities = cardAbilities;
	}

	public List<Status> getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(List<Status> cardStatus) {
		this.cardStatus = cardStatus;
	}

	public int getMaintenanceCost() {
		return maintenanceCost;
	}

	public void setMaintenanceCost(int maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}
	
	public void changeTerrain(TerrainEnum terrainEnum) {
		// triggers here
		super.getFieldInfo().setTerrainEnum(terrainEnum);
	}
	
}
