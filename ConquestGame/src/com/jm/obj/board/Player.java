package com.jm.obj.board;

import java.util.ArrayList;
import java.util.List;

import com.jm.config.GameStatusEnum;
import com.jm.config.HeroEnum;
import com.jm.hero.Hero;

public class Player {
//
	private GameStatusEnum gameStatusEnum;
	private Player enemyPlayer;
	private int turnNum = 0;
	
	
	
	static {
		
		
		
		
	}
	
	
	private Hero hero;
	
	private String playerName;
	
	
	private List<FieldBuilding> building = new ArrayList<>();
	private List<FieldUnit> unitList;
	
	
	
	public GameStatusEnum getGameStatusEnum() {
		return gameStatusEnum;
	}
	public void setGameStatusEnum(GameStatusEnum gameStatusEnum) {
		this.gameStatusEnum = gameStatusEnum;
	}
	private Player getEnemyPlayer() {
		return enemyPlayer;
	}
	public void setEnemyPlayer(Player enemyPlayer) {
		this.enemyPlayer = enemyPlayer;
	}

	public Hero getHero() {
		return hero;
	}
	public void setHero(Hero hero) {
		this.hero = hero;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public List<FieldBuilding> getBuilding() {
		return building;
	}
	public void setBuilding(List<FieldBuilding> building) {
		this.building = building;
	}
	public List<FieldUnit> getUnitList() {
		return unitList;
	}
	public void setUnitList(List<FieldUnit> unitList) {
		this.unitList = unitList;
	}
	
	
	public void play() {
		turnNum++;
		hero.checkDraw(turnNum);
		
		
	
	}
	// players turn phases is here  
	// optimize later 
		
	
	
	
	
	
}
