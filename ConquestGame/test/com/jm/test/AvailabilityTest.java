package com.jm.test;


import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.jm.card.obj.unit.Unit;
import com.jm.unitavailability.HumanRaceLvl1;
import com.jm.unitavailability.HumanRaceLvl2;

public class AvailabilityTest {

	
	@Test
	public void humanLvl1Count() {
		
		HumanRaceLvl1 humanLvl1 = new HumanRaceLvl1();
		humanLvl1.addAll();
		List<Unit> humanList= humanLvl1.getAvailableUnits();
		
		int availableUnitCount = humanLvl1.getAvailableUnits().size();
		humanList.stream().forEach(System.out::println);
	
		assertTrue(availableUnitCount == 1);
	}
	
	@Test
	public void humanLvl2Count() {
		
		HumanRaceLvl2 humanLvl2 = new HumanRaceLvl2();
		humanLvl2.addAll();
		List<Unit> humanList= humanLvl2.getAvailableUnits();
		int availableUnitCount = humanLvl2.getAvailableUnits().size();
		humanList.stream().forEach(System.out::println);
	
		assertTrue(availableUnitCount == 2);
	}

}
