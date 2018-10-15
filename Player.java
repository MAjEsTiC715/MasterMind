import java.util.ArrayList;
import java.util.Collections;

public class Player {
    private String guess = "";

    public void setGuess(String g) {
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

    public ArrayList<String> check(ArrayList<Character> answer) {
	ArrayList<Character> tempG = new ArrayList<Character>();
	ArrayList<Character> tempA = new ArrayList<Character>();
	ArrayList<Character> guessList = new ArrayList<Character>();
	ArrayList<String> checkResult = new ArrayList<String>();

	for (char c : getGuess().toCharArray()) {
	    tempG.add(c);
	    guessList.add(c);
	}
	for (char r : answer) {
	    tempA.add(r);
	}

	// Check for Black pegs
	for (int i = 0; i < guessList.size(); i++) {
	    if (tempG.get(i) == tempA.get(i)) {
		checkResult.add("Black");
		tempG.set(i, 'X');
		tempA.set(i, 'X');
	    }
	}
	// Check for White pegs
	for (int j = 0; j < guessList.size(); j++) {
	    if (!(tempG.get(j).equals('X'))) {
		for (int k = 0; k < answer.size(); k++) {
		    if (!(tempA.get(k).equals('X'))) {
			if (tempG.get(j) == tempA.get(k)) {
			    checkResult.add("White");
			    tempG.set(j, 'X');
			    tempA.set(j, 'X');
			}
		    }
		}
	    }
	}
	Collections.shuffle(checkResult);
	return checkResult;
    }
}
