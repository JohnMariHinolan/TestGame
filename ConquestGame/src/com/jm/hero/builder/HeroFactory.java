package com.jm.hero.builder;

import java.util.List;

import com.jm.card.obj.unit.Unit;
import com.jm.config.HeroEnum;
import com.jm.hero.Hero;
import com.jm.unitavailability.HumanRaceLvl3;

public class HeroFactory {

	public Hero buildHero(HeroEnum heroEnum) {
	
		switch(heroEnum) {
		case SNAKE:
					return null;
				   
				   default:
					   System.err.println("Unrecognized hero");
						return null;
		}
		
		
		
	}
	
	
	private Hero createSnake() {
		Hero hero = new Hero();
		
		
		
		
		HumanRaceLvl3 humanLvl3 = new HumanRaceLvl3();
		humanLvl3.addAll();
		List<Unit> humanList= humanLvl3.getAvailableUnits();

		// 
		
		
		return hero;
	}
	
	
}
