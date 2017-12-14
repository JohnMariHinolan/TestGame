package com.jm.test;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.jm.obj.ability.Ability;
import com.jm.obj.ability.CardPicker;
import com.jm.obj.board.Player;

public class AbilityTest {

	@Test
	public void test() {
		Ability ability = new Ability();
		ability.setAbilityName("Free Gold");
		
		ability.setAbilityActivation((Player p,CardPicker card)->{
			
			
		});
		fail("Not yet implemented");
	}

}
