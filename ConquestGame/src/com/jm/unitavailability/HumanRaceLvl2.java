package com.jm.unitavailability;

import com.jm.card.obj.unit.HumanUnitFactory;
import com.jm.card.obj.unit.Unit;
import com.jm.config.UnitNameEnum;

public class HumanRaceLvl2 extends HumanRaceLvl1{

	@Override
	public void addAll() {
		// TODO Auto-generated method stub	
		super.addAll();	
		Unit knight = HumanUnitFactory.buildHumanUnit(UnitNameEnum.HUMAN_LV2_KNIGHT);
		
		super.addAvailableUnits(knight);
		
	}
}
