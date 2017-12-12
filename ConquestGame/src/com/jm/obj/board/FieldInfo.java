package com.jm.obj.board;
import com.jm.config.TerrainEnum;

public class FieldInfo {

	private String position;
	private int fieldPos;
	private boolean isOccupied;
	private TerrainEnum terrainEnum;
	
	public boolean isOccupied() {
		return isOccupied;
	}
	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getFieldPos() {
		return fieldPos;
	}
	public void setFieldPos(int fieldPos) {
		this.fieldPos = fieldPos;
	}
	public TerrainEnum getTerrainEnum() {
		return terrainEnum;
	}
	public void setTerrainEnum(TerrainEnum terrainEnum) {
		this.terrainEnum = terrainEnum;
	}
	
	
	
}
