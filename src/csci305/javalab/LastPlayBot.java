package csci305.javalab;

public class LastPlayBot extends Player{

	Boolean firstRound = true;
	public LastPlayBot(String inName) {
		super(inName);
		
	}

	@Override
	public Element Play() {
		//arbitrairly pick an element/move to return if the opponent has no previous rounds
		if (firstRound == true)
		{
			firstRound = false;
			return new Rock("Rock");

		}else
			return this.opponent.getLastMove();	//return opponents last move (thats why it's called lastPlayBot)
	}
}	