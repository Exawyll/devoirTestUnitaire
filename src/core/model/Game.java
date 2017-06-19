package model;

import java.util.Scanner;

public class Game {
		
	private int answer;
	
	/**
	 * Initiates a game.
	 */
	public Game() {
	}

	/**
	 * Display the starting menu.
	 */
	public void displayMenu() {
		System.out.println("Please select the size of the alphabet you want to use ?");
		System.out.println("1 - Alphabet 11 x 20");
		System.out.println("2 - Alphabet 9 x 9");
	}
	
	/**
	 * Init the alphabet to use.
	 */
	public void init() {
		Scanner in = new Scanner(System.in);
		
		while(answer != 1 && answer != 2) {
			answer = in.nextInt();
			
			if (answer != 1 && answer != 2) {
				System.out.println("Please, I said only 1 or 2...");
			}
		}
		
		System.out.println("Thank you");
	}

	/**
	 * @return the answer
	 */
	public int getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(int answer) {
		this.answer = answer;
	}
}
