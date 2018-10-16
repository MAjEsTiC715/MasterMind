import java.util.ArrayList;
import java.util.Collections;
/**
 * The Player super class is the parent to Human, Random, and Smart subclasses
 * It gets guess from subclasses and check the String guess
 * Returns pegs
 */
public class Player {
    private String guess = "";

    public void setGuess(String g) {
	g = g.toUpperCase();                    // Make g characters uppercase
	g = g.replaceAll("\\s+","");            // Gets rid of white spaces
	for (int i = 0; i < g.length(); i++) {  // Checks if characters in string are only uppercase
	    char ch = g.charAt(i);
	    if (!Character.isUpperCase(ch)) {   // Exit if not
		System.out.println("Error in guess: ");
		System.exit(0);
	    }
	}
	guess = g;
    }

    public String getGuess() {
	return guess;
    }

    public String getGuessR(int cl, int d) {
	String randomG = "";
    	return randomG;
    }

    public String getGuessH() {
	String humanG = "";
	return humanG;
    }

    /** Checks player guess with result from Code; returns pegs based on guess */
    public ArrayList<String> check(ArrayList<Character> answer) {
	ArrayList<Character> tempG = new ArrayList<Character>();      // Temporary list for guess
	ArrayList<Character> tempA = new ArrayList<Character>();      // Temporary list for answer -> (result)
	ArrayList<Character> guessList = new ArrayList<Character>();
	ArrayList<String> checkResult = new ArrayList<String>();

	for (char c : getGuess().toCharArray()) {     // Adds characters from guess to both tempG and guessList
	    tempG.add(c);
	    guessList.add(c);
	}
	for (char r : answer) {      // Adds answer characters to tempA
	    tempA.add(r);
	}

	// Check for Black pegs
	for (int i = 0; i < guessList.size(); i++) {
	    if (tempG.get(i) == tempA.get(i)) {   // Check if characters match
		checkResult.add("Black");          
		tempG.set(i, 'X');   // Make character null by replacing it with X
		tempA.set(i, 'X');
	    }
	}
	// Check for White pegs
	for (int j = 0; j < guessList.size(); j++) {         // j represents index num of size guessList
	    if (!(tempG.get(j).equals('X'))) {               // Check if character in index j of tempG equals X
		for (int k = 0; k < answer.size(); k++) {    // k represents index num of size answer
		    if (!(tempA.get(k).equals('X'))) {       // Checks if character in index k of tempA equals X
			if (tempG.get(j) == tempA.get(k)) {  // Checks if j and k match
			    checkResult.add("White");
			    tempG.set(j, 'X');               // Make character null
			    tempA.set(j, 'X');              
			}
		    }
		}
	    }
	}
	Collections.shuffle(checkResult); // shuffle pegs
	return checkResult;
    }
}
