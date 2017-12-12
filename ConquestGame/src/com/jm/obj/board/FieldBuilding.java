package com.jm.obj.board;

import com.jm.card.obj.bldg.Building;
import com.jm.config.TerrainEnum;

public class FieldBuilding {

	
	private FieldInfo fieldInfo;
	private Building building;
	
	
	
	
	public void changeTerrain(TerrainEnum terrainEnum) {
		if(building != null ) {
			
			building.changeTerrain(terrainEnum);	
			
		}else {
			
			fieldInfo.setTerrainEnum(terrainEnum);
		
		}
		
		
	}
	
	
	
}
