package csci305.javalab;

public class Spock extends Element{

	public Spock(String inName) {
		super(inName);
	}

	@Override
	public String compareTo(Element x) {
		Outcome outcome = new Outcome(this, x);
		return outcome.first + " -- " + outcome.second;
	}

}
