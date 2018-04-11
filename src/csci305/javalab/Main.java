package csci305.javalab;

import java.util.Scanner;

public class Main {
	static Scanner scanner;
	public static void main(String[] args)
	{
		int maxRounds = 5;	//to avoid hard coding number of rounds
		//game intro
		System.out.println("Welcome to Rock, Paper, Sissors, Lizard, Spock, implemented by Joel Lechman");
		
		//display player options for user.
		System.out.println("Please choose two Players:");
		System.out.println("(1) Human");
		System.out.println("(2) StupidBot");
		System.out.println("(3) RandomBot");
		System.out.println("(4) IterativeBot");
		System.out.println("(5) LastPlayBot");
		System.out.println("(6) MyBot");
		System.out.println("");
		
		//user chooses player 1
		System.out.print("Select Player 1: ");
		Player p1 = promptForPlayer();
		
		//user chooses player 2
		System.out.print("Select Player 2: ");
		Player p2 = promptForPlayer();
		
		System.out.println();
		System.out.println(p1.getName() + " vs. " + p2.getName() + ". Go!");
		System.out.println();
		
		p1.opponent = p2;	//setting opponents for lastPlay bot
		p2.opponent = p1;
		
		
		
		int roundCount = 1;
		int p1Score = 0;
		int p2Score = 0;
		while(roundCount <= maxRounds)	//maxRounds to avoid hardcoding # of rounds. 	
		{
			System.out.println("Round " + roundCount + ":");
			
			Element p1Play = p1.Play();
			Element p2Play = p2.Play();
			
			//updating lastMove
			p1.updateLastMove(p1Play); //update lastMove for lastplaybot
			p2.updateLastMove(p2Play);
			
			
			
			
			System.out.println("Player 1 chose "+ p1Play.getName());
			System.out.println("Player 2 chose "+ p2Play.getName());
			
			String result = (p1Play.compareTo(p2Play));				//getting result string
		
			
			String phrase = result.substring(0, result.indexOf('-')); 	//parsing compareTo result string for the phrase (ie. rock crushes scissors)
			System.out.println(phrase);
			
			//determine who won the round. or tie. using the result string
			if(result.contains("Tie")){
				System.out.println("Round was a tie");
			}else if(result.contains("Win")) //p1 wins the round
			{
				System.out.println("Player 1 won the round");
				p1Score++;
			}else if(result.contains("Lose")) //p2 wins the round
			{	
				System.out.println("Player 2 won the round");
				p2Score++;
			}
			
			roundCount++;
			System.out.println("");
			
			
		}
		
		//display score at the end of the game & display the determined winner.
		System.out.println("The score is " + p1Score + " to " + p2Score + ".");
		if(p1Score > p2Score)	//if p1 wins the game
		{
			System.out.println("Player 1 wins!");
		}else if (p2Score > p1Score)	//if p2 wins the game
		{
			System.out.println("Player 2 wins!");
		}else					// game is a draw.
		{
			System.out.println("Game was a draw");
		}
	}
	
	
	
	/*
	 * promptForPlayer() is a helper method that prompts for user's input to determine
	 * who the players of the game will be.
	 * @returns a class of type player for further handling.
	 */
	public static Player promptForPlayer()
	{	
		int input = -1;
		scanner = new Scanner(System.in);
		
		//check to make sure user input is valid.
		while(input < 1|| input > 6)
		{
			input = scanner.nextInt();	//first grab input

			if (input < 1 || input > 6)	//if invalid, prompt & loop
			{
				System.out.println("Error, please choose a valid option for a player.");	
			}else						//if valid, break out of check
			{
				break;
			}
			
		}
		
		switch(input)		//return a player based on user's input
		{
		case(1):
			return new Human("Human");
		case(2):
			return new StupidBot("StupidBot");
		case(3):
			return new RandomBot("RandomBot");
		case(4):
			return new IterativeBot("IterativeBot");
		case(5):
			return new LastPlayBot("LastPlayBot");
		default: //case 6
			return new MyBot("MyBot");
		}
	}
}
