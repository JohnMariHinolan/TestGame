package com.jm.test;


import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.jm.obj.unit.Unit;
import com.jm.unitavailability.HumanUnitsLvl1;
import com.jm.unitavailability.HumanUnitsLvl2;

public class AvailabilityTest {

	
	@Test
	public void humanLvl1Count() {
		
		HumanUnitsLvl1 humanLvl1 = new HumanUnitsLvl1();
		humanLvl1.addAll();
		List<Unit> humanList= humanLvl1.getAvailableUnits();
		int availableUnitCount = humanLvl1.getAvailableUnits().size();
		humanList.stream().forEach(System.out::println);
	
		assertTrue(availableUnitCount == 1);
	}
	
	@Test
	public void humanLvl2Count() {
		
		HumanUnitsLvl2 humanLvl2 = new HumanUnitsLvl2();
		humanLvl2.addAll();
		List<Unit> humanList= humanLvl2.getAvailableUnits();
		int availableUnitCount = humanLvl2.getAvailableUnits().size();
		humanList.stream().forEach(System.out::println);
	
		assertTrue(availableUnitCount == 2);
	}

}
