import java.util.Random;
import java.util.ArrayList;
/**
 * The Code class for the MasterMind game
 * It generates the code that the player must guess.
 */
public class Code {
    private int codeLength;
    private boolean duplicate;
    private final char RED = 'R';       // Named constants for the colors
    private final char BLUE = 'B';
    private final char YELLOW = 'Y';
    private final char PURPLE = 'P';
    private final char BLACK = 'B';
    private final char GREEN = 'G';
    private final char ORANGE = 'O';
    private final char INDIGO = 'I';
    private final char TORQUOISE = 'T';
    private final char WHITE = 'W';

    public void setCodeLength(int cl) {
	if (!(cl >= 2 && cl <= 10)) {   // Check if code length is valid
	System.out.println("Not a number between 2 and 10");
	System.exit(0); // Terminate program
	}
	else {
	    codeLength = cl;
	}
    }

    public void setDuplicate(int d) {
	if (d == 0) {                   // Check if duplicate is valid
	    duplicate = false;
	}
	else if (d == 1) {
	    duplicate = true;
	}
	else {
	    System.out.print("Duplicate Not Valid");
	    System.exit(0); // Terminate program
	}
    }
    
    public int getCodeLength() {
	return codeLength;
    }
    
    public boolean getDuplicate() {
	return duplicate;
    }

    /** Generate code in character arraylist form and return answer*/
    public ArrayList<Character> Code() {
	ArrayList<Character> answer = new ArrayList<>();
	ArrayList<Character> checkList = new ArrayList<>();
	char [] colorBalls = {RED, BLUE, YELLOW, PURPLE, BLACK, GREEN, ORANGE, INDIGO, TORQUOISE, WHITE};
	Random rand = new Random();
	
	if (getDuplicate() == true) {       // Check if duplicates are enabled
	    for (int i = 0; i < getCodeLength(); i++) {
		int n = rand.nextInt(10);   // Generate random number
		char c = colorBalls[n];     // Get character associated with the index n
		answer.add(c);
	    }
	}
	else if (getDuplicate() == false) { // Check if duplicates are disabled
	    int j = 0;
	    while (j < getCodeLength()) {
		int n = rand.nextInt(10);   
		char c = colorBalls[n];
		checkList.add(c);
		for (char x : checkList) {  // Check each character in checkList with answer list
		    if (!answer.contains(x)) {
			answer.add(c);
			j++;
		    }
		}
	    }
	}
	return answer;
    }
}
