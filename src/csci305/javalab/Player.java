package csci305.javalab;


/*
 * @author Joel Lechman
 * 
 */


public abstract class Player {
	private String name;
	private Element lastMove;		//holder for lastplaybot
	public Player opponent;


	Element [] moves = new Element[5];			//list of possible moves for bots to reference.
	Rock rock = new Rock("Rock");
	Paper paper = new Paper("Paper");
	Scissors scissors = new Scissors("Scissors");
	Lizard lizard = new Lizard("Lizard");
	Spock spock = new Spock("Spock");

	public Player (String inName)
	{
		name = inName;
		//initialize the options array.
		moves[0] = rock;
		moves[1] = paper;
		moves[2] = scissors;
		moves[3] = lizard;
		moves[4] = spock;
	}

	public String getName()
	{
		return name;
	}

	//helper method for lastPlayBot use
	//update lastPlay for next Term
	public void updateLastMove(Element move)
	{
		lastMove = move;
	}

	
	//helper method for lastPlayBot use
	//access lastPlay variable in supertype player.
	public Element getLastMove()
	{
		return lastMove;
	}

	public abstract Element Play();

}
