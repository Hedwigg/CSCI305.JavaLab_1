package csci305.javalab;

public class Scissors extends Element{

	public Scissors(String inName) {
		super(inName);
	}

	@Override
	public String compareTo(Element x) {
		Outcome outcome = new Outcome(this, x);
		return outcome.first + " -- " + outcome.second;
	}

}
