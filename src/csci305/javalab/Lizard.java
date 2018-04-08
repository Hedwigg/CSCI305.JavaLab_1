package csci305.javalab;

public class Lizard extends Element{

	public Lizard(String inName) {
		super(inName);
	}

	//Abstract compareTo method that uses Outcome class as a helper to determine winner 
	//& correct round phrase (ie. Scissors decapitate Lizard)
	@Override
	public String compareTo(Element x) {
		Outcome outcome = new Outcome(this, x);
		return outcome.first + " -- " + outcome.second;
	}

}
