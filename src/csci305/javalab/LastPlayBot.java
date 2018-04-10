package csci305.javalab;

/*
 * Class last play bot is a player that chooses its move by picking what it's opponent chose last. If its the first round, this bot defaults to picking Rock as it's move.
 */

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