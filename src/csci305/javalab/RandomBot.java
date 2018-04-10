package csci305.javalab;

import java.util.Random;
/*
 * class random bot uses Math.random() to determine what move it will play.
 * it uses the random generated integer and the moves[] array (in class player) to return a valid move.
 */
public class RandomBot extends Player{
	
	
	Random random = new Random();
	
	public RandomBot(String inName) {
		super(inName);
	}

	@Override
	public Element Play() {
		int ranNum = (int) (Math.random() * 5); 
		Element move = moves[ranNum];	//use random int to pick an Element from move array. (see player class).
		return move;
	}
}
