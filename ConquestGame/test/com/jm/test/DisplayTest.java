package com.jm.test;
import org.junit.Test;

import com.jm.hero.Hero;
public class DisplayTest {

	@Test
	public void displayHero() {
		
		Hero hero = new Hero();
		String heroDisplay = hero.toString();
		
		float f = 3f;

		
		System.out.println("Hero Display: " + heroDisplay);
	}
	
	
}
