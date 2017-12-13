package com.jm.race;

import java.util.List;

import com.jm.ui.Logo;

public abstract class Race {
	
	
	private String name;
	

	
	private List<Logo> logoList;
	
	
	public  void addLogo(Logo logo) {
		this.logoList.add(logo);		
	};
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Logo> getLogoList() {
		return logoList;
	}

	public void setLogoList(List<Logo> logoList) {
		this.logoList = logoList;
	}

	public abstract void build();
}
