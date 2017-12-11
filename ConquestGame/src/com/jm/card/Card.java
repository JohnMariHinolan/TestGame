package com.jm.card;

import java.util.UUID;

public abstract class Card {

	
	UUID uuid = java.util.UUID.randomUUID();
	
	
	private String artwork;
	private String lore;
	private String name;
	
	
	public void damageReceived(){
		
	}
	
	// use design pattern
	public void destroy(){}

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
	
	
	
	
	public boolean isEquals(UUID uuid) {
		return this.uuid == uuid;
	}
	
}
