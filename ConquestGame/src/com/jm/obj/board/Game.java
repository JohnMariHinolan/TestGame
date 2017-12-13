package com.jm.obj.board;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

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
		if(playerList == null || playerList.size() <MAX_PLAYERS) {
			return;
		}
		Player playerOne = playerList.get(0);
		Player playerTwo = playerList.get(1);
		
		playerOne.setEnemyPlayer(playerTwo);
		playerTwo.setEnemyPlayer(playerOne);
		
		//
		while(GameStatusEnum.ONGOING == gameStatusEnum) {
		
			Player currentPLayer = playerList.get(currentPlayer);
			currentPLayer.play();
			switchPlayer();
			
		}
		
	}
	
	
	
	
	private void switchPlayer(){
		this.currentPlayer = this.currentPlayer + 1;
		if(this.currentPlayer == (MAX_PLAYERS -1)) {
			this.currentPlayer  = 0;
		}
		
		
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			String jsonInString = mapper.writeValueAsString(this);
			sb.append(jsonInString);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sb.toString();
	}
	
	// majority of game coding will be here

	
}
