package LiarsGame.game;

import java.util.ArrayList;
import java.util.List;

public class gameProcedure {
	
	// storing first roll
	private List<Die> diceRoll = new ArrayList<>();
	
	// 
	private List<Integer> bet = new ArrayList<>();
	
	// Constructor for initializing Hand
	public gameProcedure(int size) {
		for(int count = 0; count < size; count++) {
			diceRoll.add(new Die());
		}
	}
	
	public List<Die> getDice(){
		return diceRoll;
	}
	
	public List<Integer> getBet(){
		return bet;
	}
	
	
}
