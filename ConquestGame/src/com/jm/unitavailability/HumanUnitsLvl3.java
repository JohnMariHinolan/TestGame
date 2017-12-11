package com.jm.unitavailability;

import com.jm.config.UnitNameEnum;
import com.jm.obj.unit.HumanUnitFactory;
import com.jm.obj.unit.Unit;

public class HumanUnitsLvl3 extends HumanUnitsLvl2{

	@Override
	public void addAll() {
		// TODO Auto-generated method stub	
		super.addAll();	
		Unit knight = HumanUnitFactory.buildHumanUnit(UnitNameEnum.HUMAN_LV3_SOLDIER);
		
		super.addAvailableUnits(knight);
		
	}
	
}
