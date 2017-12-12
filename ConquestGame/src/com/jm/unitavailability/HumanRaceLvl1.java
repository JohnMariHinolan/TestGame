package com.jm.unitavailability;

import com.jm.card.obj.unit.HumanUnitFactory;
import com.jm.card.obj.unit.Unit;
import com.jm.config.UnitNameEnum;

public class HumanRaceLvl1 extends HumanBase{

	@Override
	public void addAll() {
		// TODO Auto-generated method stub	
		super.addAll();			
		
		Unit warrior = HumanUnitFactory.buildHumanUnit(UnitNameEnum.HUMAN_LV1_WARRIOR);
		
		
		
		super.addAvailableUnits(warrior);
	}
}
