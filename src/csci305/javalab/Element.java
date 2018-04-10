package csci305.javalab;


/*
 * @author Joel Lechman
 * 
 * Super class element to handle general methods for each move in the game. I.e. simple things like get method for the name of the move.
 */


public abstract class Element {
	private String name;
	
	
	public Element (String inName)
	{
		name = inName;
	}

	public String getName()
	{
		return name;
	}
	
	public abstract String compareTo(Element x);
	
}
