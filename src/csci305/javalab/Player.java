package csci305.javalab;


/*
 * @author Joel Lechman
 * 
 */


public abstract class Player {
	private String name;
	
	
	public Player (String inName)
	{
		name = inName;
	}
	
	public String getName()
	{
		return name;
	}
	
	public abstract Element Play();
	
}

//todo
//variable to hold last play (which is updated in every player's version of play()
//a get method for this variable so that lastplaybot can find the information.
//somehow give lastplaybot the ability to figure out it's opponent.
