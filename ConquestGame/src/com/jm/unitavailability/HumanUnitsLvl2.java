package com.jm.unitavailability;

import com.jm.config.UnitNameEnum;
import com.jm.obj.unit.HumanUnitFactory;
import com.jm.obj.unit.Unit;

public class HumanUnitsLvl2 extends HumanUnitsLvl1{

	@Override
	public void addAll() {
		// TODO Auto-generated method stub	
		super.addAll();	
		Unit knight = HumanUnitFactory.buildHumanUnit(UnitNameEnum.HUMAN_LV2_KNIGHT);
		
		super.addAvailableUnits(knight);
		
	}
}
