package csci305.javalab;

public class LastPlayBot extends Player{

	Boolean firstRound = true;
	public LastPlayBot(String inName) {
		super(inName);
		
	}

	@Override
	public Element Play() {
		if (firstRound == true)
		{
			firstRound = false;
			return new Rock("Rock");

		}else
			return this.opponent.getLastMove();
	}
}	