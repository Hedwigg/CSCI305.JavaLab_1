package csci305.javalab;


/*
 * @author Joel Lechman
 * 
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
