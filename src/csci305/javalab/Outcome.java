package csci305.javalab;

public class Outcome {
	public String first;
	public String second;
	
	public Outcome(Lizard lizard, Element x) {
		switch(x.getName())
		{
			case "Paper":
				first = "Lizard Eats Paper";
				second = "Win";
				break;
				
			case "Spock":
				first = "Lizard poisons Spock";
				second = "Win"; 
				
			case "Rock":
				first = "Lizard poisons Spock";
				second = "Lose";
				break;
				
			case "Scissors":
				first = "Scissors decapitate Lizard";
				second = "Lose";
				break;
			case "Lizard":
				first = "Lizard equals Lizard";
				second = "Tie";
				break;
			default:
				first = "Error "+ lizard.getName();
				second = "error" + x.getName();
				break;
		}
	}

	public Outcome(Paper paper, Element x) {
		switch(x.getName())
		{
			case "Rock":
				first = "Paper covers Rock";
				second = "Win";
				break;
				
			case "Spock":
				first = "Paper disproves Spock";
				second = "Win"; 
				break;
				
			case "Lizard":
				first = "Lizard eats Paper";
				second = "Lose";
				break;
				
			case "Scissors":
				first = "Scissors cut Paper";
				second = "Lose";
				break;
			case "Paper":
				first = "Paper equals Paper";
				second = "Tie";
				break;
			default:
				first = "Error "+ paper.getName();
				second = "error" + x.getName();
				break;
		}
	}

	public Outcome(Rock rock, Element x) {
		switch(x.getName())
		{
			case "Scissors":
				first = "Rock crushes Scissors";
				second = "Win";
				break; 
				
			case "Lizard":
				first = "Rock crushes Lizard";
				second = "Win"; 
				break;
				
			case "Paper":
				first = "Paper covers Rock";
				second = "Lose";
				break;
			case "Spock":
				first = "Spock vaporizes Rock";
				second = "Lose";
				break;
			case "Rock":
				first = "Rock equals Rock";
				second = "Tie";
				break;
			default:
				first = "Error "+ rock.getName();
				second = "error" + x.getName();
				break;
		}
	}

	public Outcome(Scissors scissors, Element x) {
		switch(x.getName())
		{
			case "Paper":
				first = "Scissors cut Paper";
				second = "Win";
				break;
				
			case "Lizard":
				first = "Scissors decapitate Lizard";
				second = "Win"; 
				break;
				
			case "Rock":
				first = "Rock crushes Scissors";
				second = "Lose";
				break;
				
			case "Spock":
				first = "Spock smashes Scissors";
				second = "Lose";
				break;
			case "Scissors":
				first = "Scissors equals Scissors";
				second = "Tie";
				break;
			default:
				first = "Error "+ scissors.getName();
				second = "error" + x.getName();
				break;
		}
	}

	public Outcome(Spock spock, Element x) {
		switch(x.getName())
		{
			case "Scissors":
				first = "Spock smashes Scissors";
				second = "Win";
				break;
			case "Rock":
				first = "Spock vaporizes Rock";
				second = "Win";
				break;
				
			case "Lizard":
				first = "Lizard poisons Spock";
				second = "Lose";
				break;
				
			case "Paper":
				first = "Paper disproves Spock";
				second = "Lose";
				break;
			case "Spock":
				first = "Spock equals Spock";
				second = "Tie";
				break;
			default:
				first = "Error "+ spock.getName();
				second = "error" + x.getName();
				break;
		}
	}
}
