package csci305.javalab;

import java.util.Random;


/*
 * MyBot is a Player class of my own creation.
 * MyBot is a true Hipster, it despises the new version of this classic game. Therefore it will never choose the Lizard or Spock option
 * out of pure hatred. Even if it means it is playing at a disadvantage. Therefore it picks from the "original" option set 
 * (rock,paper,scissors) at random. Using a random number generator similar to the RandomBot.
 */


public class MyBot extends Player{
	
	Random random = new Random();
	Element [] options = new Element[3];
	Rock rock = new Rock("Rock");
	Paper paper = new Paper("Paper");
	Scissors scissors = new Scissors("Scissors");

	public MyBot(String inName) {
		super(inName);
		
		options[0] = rock;
		options[1] = paper;
		options[2] = scissors;
	}

	@Override
	public Element Play() {
		int ranNum = (int) (Math.random() * options.length); 
		Element move = options[ranNum];	//use randomly generated int to help pick an element pick an Element
		return move;
	}

}
