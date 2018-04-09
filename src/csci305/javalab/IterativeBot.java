package csci305.javalab;

public class IterativeBot extends Player{
	
	private int iterator = 0;
		
	public IterativeBot(String inName) {
		super(inName);
		
	}

	@Override
	public Element Play() {
		if(iterator > 4)	//check if we need to reset/loop iterator
		{
			iterator = 0;
		}
		Element next = moves[iterator];
		iterator++;
		return(next); //return the element next in line
		
	}

}
