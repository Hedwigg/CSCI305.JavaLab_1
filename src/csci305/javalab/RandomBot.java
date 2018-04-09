package csci305.javalab;

import java.util.Random;

public class RandomBot extends Player{
	
	
	Random random = new Random();
	
	public RandomBot(String inName) {
		super(inName);
	}

	@Override
	public Element Play() {
		int ranNum = (int) (Math.random() * 5); 
		Element move = moves[ranNum];	//use random int to pick an Element from options array.
		return move;
	}
}
