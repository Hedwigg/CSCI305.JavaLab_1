package csci305.javalab;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{		
		System.out.println("Welcome to Rock, Paper, Sissors, Lizard, Spock, implemented by Joel Lechman");
		
		System.out.println("Please choose two Players:");
		System.out.println("(1) Human");
		System.out.println("(2) StupidBot");
		System.out.println("(3) RandomBot");
		System.out.println("(4) IterativeBot");
		System.out.println("(5) LastPlayBot");
		System.out.println("(6) MyBot");
		System.out.println("");
		
		
		System.out.print("Select Player 1: ");
		Player p1 = promptForPlayer();
		
		System.out.print("Select Player 2: ");
		Player p2 = promptForPlayer();
		
		System.out.println();
		System.out.println(p1.getName() + " vs. " + p2.getName() + ". Go1!");
		System.out.println();
		
		
		
		
		int roundCount = 1;
		int p1Score = 0;
		int p2Score = 0;
		while(roundCount <= 5)
		{
			System.out.println("Round " + roundCount + ":");
			
			Element p1Play = p1.Play();
			Element p2Play = p2.Play();
			
			System.out.println("Player 1 chose "+ p1Play.getName());
			System.out.println("Player 2 chose "+ p2Play.getName());
			
			String result = (p1Play.compareTo(p2Play));
			
			String one = result.substring(0, result.indexOf('-')); 
			System.out.println(one);
			
			
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
	
	public static Player promptForPlayer()
	{		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		switch(input)
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