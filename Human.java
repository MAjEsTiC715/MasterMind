import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.io.*;

public class Human extends Player {
    @Override
    public String getGuess() {
	String g;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your guess: ");
	g = input.nextLine();
	g.toUpperCase();
	return g;
    }
    @Override
    public ArrayList<String> check(String g, ArrayList<Character> r, boolean d) {
	ArrayList<String> checkRes = new ArrayList<String>();
	ArrayList<Character> gg = new ArrayList<Character>();
	ArrayList<Character> tempG = new ArrayList<Character>();
	ArrayList<Character> tempR = new ArrayList<Character>();
	
	for (char c : g.toCharArray()) {
	    tempG.add(c);
	    gg.add(c);
	}
	for (char x : r) {
	    tempR.add(x);
	}
	// Check for Black pegs
	for (int i = 0; i < gg.size(); i++) {
	    if (tempG.get(i) == tempR.get(i)) {
		checkRes.add("Black");
		tempG.set(i, 'X');
		tempR.set(i, 'X');
	    }
	}
	// Check for White pegs
	for(int j = 0; j < gg.size(); j++) {
	    if (!(tempG.get(j).equals('X'))) {
		for (int k = 0; k < r.size(); k++) {
		    if (!(tempR.get(k).equals('X'))) {
			if (tempG.get(j) == tempR.get(k)) {
			    checkRes.add("White");
			    tempG.set(j, 'X');
			    tempR.set(k, 'X');
			}
		    }
		}
	    }
	}
	
	Collections.shuffle(checkRes);
	System.out.println(checkRes);
	System.out.println(r);
	return checkRes;
	
    }
}
