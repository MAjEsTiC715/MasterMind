import java.util.Scanner;
import java.util.ArrayList;

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

	while (start != -1) {
	    if (start == 1) {
		int i = 0;
		Player h = new Human();
		PatternGenerator p = new PatternGenerator(lengthCode, duplicates);
		ArrayList<Character> result = p.getAnswer();
		ArrayList<Character> r = p.getCode(lengthCode, result, duplicates);
		while (i < numOfGuess){
		    String guess = h.getGuess();
		    ArrayList<Character> c = h.check(guess, r, duplicates);
		    if (c == r) {
			System.out.println("You Win! The secret code was: " + r);
		    }
		    i++;
		}
		System.out.println("Game Over! The secret code was: " + r);
		
	    }
	}
    }
}
