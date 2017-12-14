package com.jm.card;

import java.util.UUID;

import com.jm.obj.board.FieldInfo;
import com.jm.obj.board.Player;

public abstract class Card {

	// current Owner of the card
	
	private Player player;
	
	
	UUID uuid = java.util.UUID.randomUUID();
	
	
	private String artwork;
	private String cardDescription;
	

	private String lore;
	private String name;
	
	private FieldInfo fieldInfo;
	
	
	
	
	private  boolean isUnderPenalty;
	
	public void damageReceived(){
		//effect here
	}
	
	// use design pattern
	public void destroy(){
		
		
	}

	public String getArtwork() {
		return artwork;
	}

	public void setArtwork(String artwork) {
		this.artwork = artwork;
	}

	public String getLore() {
		return lore;
	}

	public void setLore(String lore) {
		this.lore = lore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public boolean isUnderPenalty() {
		return isUnderPenalty;
	}

	public void setUnderPenalty(boolean isUnderPenalty) {
		this.isUnderPenalty = isUnderPenalty;
	}

	public boolean isEquals(UUID uuid) {
		return this.uuid == uuid;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public FieldInfo getFieldInfo() {
		return fieldInfo;
	}

	public void setFieldInfo(FieldInfo fieldInfo) {
		this.fieldInfo = fieldInfo;
	}

	public String getCardDescription() {
		return cardDescription;
	}

	public void setCardDescription(String cardDescription) {
		this.cardDescription = cardDescription;
	}
	
	
	
	
	
}
