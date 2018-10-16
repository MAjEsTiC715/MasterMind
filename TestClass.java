import java.util.ArrayList;
/**
 * The class TestClass test all objects with edge cases
 */
public class TestClass {
    
    public static void main(String[] args) {
	ArrayList<Character> result = new ArrayList<>();
	int entry = Integer.parseInt(args[0]);

	// Test code object
	if (entry == 1) {
	    System.out.println("With Duplicates: ");
	    Code d = new Code();
	    d.setCodeLength(5);
	    d.setDuplicate(0);
	    result = d.Code();
	    System.out.println(result + "\nWith Duplicates but not equal to 1 or 0: \n");
	    
	    result.clear();
	    d.setDuplicate(2);
	    result = d.Code();
	    System.out.println(result + "\nWithout Duplicates: \n");
	    
	    result.clear();
	    d.setDuplicate(1);
	    result = d.Code();
	    System.out.println(result + "\nWith codeLength not within 2 and 10: \n");
	    
	    result.clear();
	    d.setCodeLength(11);
	    System.out.println(result + "\nTHE END\n");
	}
	// Test human object
	if (entry == 2) {
	    System.out.println("Guess with lowercase");
	    String guess = "rrrrr";
	    Player human = new Human();
	    human.setGuess(guess);
	    System.out.println("Guess with uppercase");
	    guess = "RRRRRR";
	    human.setGuess(guess);
	    System.out.println("Guess with numbers");
	    guess = "RR1RR";
	    human.setGuess(guess);
	    System.out.println("Guess with special characters");
	    guess = "R@#!";
	    human.setGuess(guess);
	    System.out.println("THE END");
	}
	// Test random object is the same logic and method as Code
 
	// Test mastermind object
	if (entry == 3) {
	    System.out.println("MasterMind as normal");
	    new MasterMind(5, 1, 15, 2);
	    System.out.println("MasterMind with more than 50 tries or less than 1");
	    new MasterMind(5, 1, 51, 2);
	    System.out.println("THE END");
	}
	// Test history object
	if (entry == 4) {
	    String str = "history1";
	    History history = new History();
	    history.setHistory(str);
	    System.out.println(history.History());
	}
    }
}
