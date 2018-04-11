package csci305.javalab;


/*
 * @author Joel Lechman
 * 
 * This class creates two values based off of the two elements passed in when it is initialized.
 * 
 * The first variable: "first" is a string describing the outcome of the comparison of the two elements.
 * The second variable: "Second" is a string describing the winner of the round based on the same comparison.
 * 
 * For readability and modularity, there are 5 overloaded constructors. One for each possible element that can be passed in.
 * Therefore if more elements are added to the game a constructor can easily be copied and modified for said element.
 * 
 * 
 * 
 * The comparisons are made using the names of the elements passed in. (Specifically the second element).
 *
 */

public class Outcome {
	public String first;
	public String second;
	
	public Outcome(Lizard lizard, Element x) {			//constructor for first parameter of type lizard
		switch(x.getName())
		{
			case "Paper":
				first = "Lizard Eats Paper";
				second = "Win";
				break;
				
			case "Spock":
				first = "Lizard poisons Spock";
				second = "Win"; 
				break;
				
			case "Rock":
				first = "Rock crushes Lizard";
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

	public Outcome(Paper paper, Element x) {	//constructor for first parameter of type paper
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

	public Outcome(Rock rock, Element x) {			//constructor for first parameter of type rock
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

	public Outcome(Scissors scissors, Element x) {		//constructor for first parameter of type scissors
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

	public Outcome(Spock spock, Element x) {			//constructor for first parameter of type spock
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
