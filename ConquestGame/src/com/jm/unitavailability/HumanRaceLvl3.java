package com.jm.unitavailability;

import com.jm.card.obj.unit.HumanUnitFactory;
import com.jm.card.obj.unit.Unit;
import com.jm.config.UnitNameEnum;

public class HumanRaceLvl3 extends HumanRaceLvl2{

	@Override
	public void addAll() {
		// TODO Auto-generated method stub	
		super.addAll();	
		Unit knight = HumanUnitFactory.buildHumanUnit(UnitNameEnum.HUMAN_LV3_SOLDIER);
		
		super.addAvailableUnits(knight);
		
	}
	
}
