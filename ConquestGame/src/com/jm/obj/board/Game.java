package com.jm.obj.board;

import java.util.ArrayList;
import java.util.List;

import com.jm.config.GameStatusEnum;

public class Game {

	// should be two
	private List<Player> playerList = new ArrayList<>();
	private final int MAX_PLAYERS = 2;
	private GameStatusEnum gameStatusEnum = GameStatusEnum.ONGOING;
	
	// first
	private int currentPlayer = 0 ;
	
	
	public void addPlayer(Player player) {
		if(playerList.size() < MAX_PLAYERS) {
			
			player.setGameStatusEnum(gameStatusEnum);
			this.playerList.add(player);
		}
	}
	
	
	public void gameStart() {
		// if players are enough....
		
		
		
		
		
		//
		while(GameStatusEnum.ONGOING == gameStatusEnum) {
		
			playerList.get(currentPlayer);
			switchPlayer();
			
		}
		
	}
	
	
	
	
	private void switchPlayer(){
		this.currentPlayer = this.currentPlayer + 1;
		if(this.currentPlayer == (MAX_PLAYERS -1)) {
			this.currentPlayer  = 0;
		}
		
		
		
	}
	
	
	
	// majority of game coding will be here

	
}
