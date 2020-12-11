package LiarsGame.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class gameProcedure {

	private List<Die> diceRoll = new ArrayList<>();
	private List<Integer> bet = new ArrayList<>();

	// Constructor for initializing Hand
	public gameProcedure(int size) {
		for (int count = 0; count < size; count++) {
			diceRoll.add(new Die());
		}
	}

	public List<Die> getDice() {
		return diceRoll;
	}

	// able to roll once
	public void roll(Random rand, int choice) {
		diceRoll.get(choice).Roll(rand);
	}

	// able to roll more then once
	public void roll(Random rand, List<Integer> choices) {
		for (int choice : choices) {
			roll(rand, choice);
		}
	}

	// all dice can be rolled
	public void roll(Random rand) {
		for (Die dice : diceRoll) {
			dice.Roll(rand);
		}
	}

	public void cupDisplay(String choice) {
		String displayDice = "";
	}

	public List<Integer> getBet() {
		return bet;
	}

	// Once concluded.. Printing die to screen
	public String toString() {

		String dieOutput = "";
		for (var die : diceRoll) {
			dieOutput = +die.getValue() + " ";
		}

		return dieOutput.trim();

	}

}
