package com.jm.race;

import java.util.List;

import com.jm.ui.Logo;

public abstract class Race {
	
	
	private String name;
	

	
	private List<Logo> logoList;
	
	
	public  void addLogo(Logo logo) {
		this.logoList.add(logo);		
	};
	
	public abstract void build();
}
