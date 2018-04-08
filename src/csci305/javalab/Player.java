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
