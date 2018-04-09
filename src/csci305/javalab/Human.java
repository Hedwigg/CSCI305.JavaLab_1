package csci305.javalab;

import java.util.Scanner;

public class Human extends Player{
	
	Element [] options = new Element[5];
	Rock rock = new Rock("Rock");
	Paper paper = new Paper("Paper");
	Scissors scissors = new Scissors("Scissors");
	Lizard lizard = new Lizard("Lizard");
	Spock spock = new Spock("Spock");
	
	
	Scanner scanner = new Scanner(System.in);
	
	
	
	public Human(String inName) {
		super(inName);
		//initialize the options array.
		options[0] = rock;
		options[1] = paper;
		options[2] = scissors;
		options[3] = lizard;
		options[4] = spock;
	}

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
			input = scanner.nextInt();
			if(input < 1 || input > 5)
			{
				System.out.println("Invalid move. Please Try again.");
			}
		}
		Element move = options[input-1];
		return move;
	}

}
