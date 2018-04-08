package csci305.javalab;

public class Lizard extends Element{

	public Lizard(String inName) {
		super(inName);
	}

	@Override
	public String compareTo(Element x) {
		Outcome outcome = new Outcome(this, x);
		return outcome.first + " -- " + outcome.second;
	}

}
