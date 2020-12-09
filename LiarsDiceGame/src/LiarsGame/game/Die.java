package LiarsGame.game;

import java.util.Random;

public class Die {

	private int sides = 6;
	private int value = 1;
	
	public Die() {
		
	}

	public void Roll(Random rand) {
		value = rand.nextInt(sides) + 1;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {

		return "" + value;

	}

}
