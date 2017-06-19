package main;

import java.util.Scanner;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("prout");
		Scanner in = new Scanner(System.in);
        // Width = 20 and 9
		int L = in.nextInt();
        
        // Height = 11 and 9
        int H = in.nextInt();
        
        if (in.hasNextLine()) {
            in.nextLine();
        }
        
        String T = in.nextLine();
        
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println("answer");

	}

}
