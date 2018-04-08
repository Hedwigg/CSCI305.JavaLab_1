package csci305.javalab;

public class IterativeBot extends Player{
	
	Element [] options = new Element[5];
	Rock rock = new Rock("Rock");
	Paper paper = new Paper("Paper");
	Scissors scissors = new Scissors("Scissors");
	Lizard lizard = new Lizard("Lizard");
	Spock spock = new Spock("Spock");
	
	private int iterator; 
		
	public IterativeBot(String inName) {
		super(inName);
		options[0] = rock;
		options[1] = paper;
		options[2] = scissors;
		options[3] = lizard;
		options[4] = spock;
		iterator = 0;
		
	}

	@Override
	public Element Play() {
		if(iterator > 4)	//check if we need to reset/loop iterator
		{
			iterator = 0;
		}
		Element next = options[iterator];
		iterator++;
		return(next); //return the element next in line
		
	}

}
