package com.jm.unitavailability;

import com.jm.config.UnitNameEnum;
import com.jm.obj.unit.HumanUnitFactory;
import com.jm.obj.unit.Unit;

public class HumanUnitsLvl1 extends HumanBase{

	@Override
	public void addAll() {
		// TODO Auto-generated method stub	
		super.addAll();			
		
		Unit warrior = HumanUnitFactory.buildHumanUnit(UnitNameEnum.HUMAN_LV1_WARRIOR);
		
		
		
		super.addAvailableUnits(warrior);
	}
}
