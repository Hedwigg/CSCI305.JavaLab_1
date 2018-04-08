package csci305.javalab;

public class StupidBot extends Player{
	public StupidBot(String inName) {
		super(inName);
	}

	@Override
	public Element Play() {
		Element move = new Rock("Rock");	//because this bot is as stupid as a rock to be playing the same move over and over.
	
		return move; 
		
	}

}
