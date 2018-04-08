package csci305.javalab;

public class LastPlayBot extends Player{

	Element lastPlay;
	
	public LastPlayBot(String inName) {
		super(inName);
		lastPlay = null;
	}

	@Override
	public Element Play() {
		if(lastPlay == null)//if there was no last play (ie first play of the match).
		{
			lastPlay = new Rock("Rock");	//arbitrarily picking rock for first move.
		}
		
		Element move = lastPlay;
		lastPlay = move;		//setting lastPlay in case this bot plays itself.
		return move;
		
	}
}
