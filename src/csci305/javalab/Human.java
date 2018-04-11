package csci305.javalab;

import java.util.Scanner;
/*
 * Class human is of type player. It handles user input to choose a move each time play() is called.
 * 
 * @author Joel Lechman
 * 
 */
public class Human extends Player{
	
	Scanner scanner = new Scanner(System.in);
	
	public Human(String inName) {
		super(inName);
		
	}

	
	/*
	 * (non-Javadoc)
	 * @see csci305.javalab.Player#Play()
	 * 
	 * returns an move of type Element.
	 */
	@Override
	public Element Play() {
		int input = 0;
		while(input < 1 || input > 5)
		{
			System.out.println("Please choose a move from the list below:");
			System.out.println("(1) : Rock");
			System.out.println("(2) : Paper");
			System.out.println("(3) : Scissors");
			System.out.println("(4) : Lizard");
			System.out.println("(5) : Spock");
			
			//get user's input
			input = scanner.nextInt();
			if(input < 1 || input > 5)		//handle if user's input is invalid. i.e. warn the user and prompt again.
			{
				System.out.println("Invalid move. Please Try again.");
			}
		}
		Element move = moves[input-1];
		return move;
	}

}
