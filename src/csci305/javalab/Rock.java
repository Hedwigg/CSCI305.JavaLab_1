package csci305.javalab;

public class Rock extends Element{

	public Rock(String inName) {
		super(inName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String compareTo(Element x) {
		Outcome outcome = new Outcome(this, x);
		return outcome.first + " -- " + outcome.second;
	}

}