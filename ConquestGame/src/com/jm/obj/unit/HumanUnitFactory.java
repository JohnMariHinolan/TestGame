package com.jm.obj.unit;

import com.jm.config.UnitNameEnum;

/***
 * Creates Units
 * 
 * *****/
public class HumanUnitFactory extends Unit {

	public static Unit buildHumanUnit(UnitNameEnum unitNameEnum) {
		
		
		if(unitNameEnum == UnitNameEnum.HUMAN_LV1_WARRIOR) {
			return buildHumanLv1Warrior();
		}else if(unitNameEnum == UnitNameEnum.HUMAN_LV2_KNIGHT) {
			return buildHumanLv2Knight();
		}
		
		System.err.println("Fail to create unit");
		return null;
		
	}
	
	private static Unit buildHumanLv1Warrior() {
		
		Unit unit = new Unit();
		unit.setAttack(2)
		.setName(UnitNameEnum.HUMAN_LV1_WARRIOR.getName())
	
		
		;
		
		return unit;
	}
	
	private static Unit buildHumanLv2Knight() {
		
		Unit unit = new Unit();
		unit.setAttack(12)
		.setName(UnitNameEnum.HUMAN_LV2_KNIGHT.getName())
		
		;
		
		return unit;
	}
}
