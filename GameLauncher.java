import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class GameLauncher {
    public static void main (String[] args) {
	int start;
	int lengthCode;
	boolean duplicates;
	int numOfGuess;
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter 1 for Human, Enter 2 for Random, Enter 3 for AI (or -1 to quit): ");
	start = input.nextInt();
	System.out.print("Enter length of code (Between 2 and 10): ");
	lengthCode = input.nextInt();
	System.out.print("Would you duplicates (true=yes; false=no): ");
	duplicates = input.nextBoolean();
	System.out.print("How many guesses (Between 1 and 50): ");
	numOfGuess = input.nextInt();

	int i = 0;
	PatternGenerator p = new PatternGenerator(lengthCode, duplicates);
	ArrayList<Character> r = p.getCode(lengthCode, duplicates);
	ArrayList<String> pegRes = new ArrayList<String>();

	while (start != -1) {
	    if (start == 1) {
		
		Player h = new Human();

		for (int j = 0; j < r.size(); j++) {
		    pegRes.add("Black");
		}
		
		while (i < numOfGuess){
		    String guess = h.getGuess();
		    ArrayList<String> c = h.check(guess, r, duplicates);
		    if (c.equals(pegRes)) {
		    	System.out.println("You Win! The secret code was: " + r);
			start = -1;
			i += 50;
		    }
		    i++;
		}
		System.out.println("Game Over! The secret code was: " + r);
		start = -1;
		
	    }
	    if (start == 2) {
		Player rand = new Random();
	    }
	}
    }
}
