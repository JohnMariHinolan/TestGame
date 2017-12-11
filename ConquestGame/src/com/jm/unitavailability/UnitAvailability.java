package com.jm.unitavailability;

import java.util.ArrayList;
import java.util.List;

import com.jm.obj.unit.Unit;

public abstract class UnitAvailability {

	
	private List<Unit> availableUnits = new ArrayList<>();
	
	public  void addAll() {};
	
	public void addAvailableUnits(Unit unit) {
		 availableUnits.add(unit);
	}


	public List<Unit> getAvailableUnits() {
		return availableUnits;
	}


	
	
	
}
