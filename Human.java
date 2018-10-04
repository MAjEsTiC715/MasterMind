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
	ArrayList<Character> temp = new ArrayList<Character>();
	ArrayList<Character> gg = new ArrayList<Character>();
	ArrayList<String> checkRes = new ArrayList<String>();
	
	for (char c : g.toCharArray()) {
	    gg.add(c);
	}
	for (int i = 0; i < r.size(); i++) {
	    char rch = r.get(i);
	    char gch = gg.get(i);
	    if (gch == rch) {
		if (!temp.contains(gch)) {
		    checkRes.add("Black");
		    temp.add(gch);
		}
	    }
	    if (gch != rch && r.contains(gch)) {
		if (!temp.contains(gch)) {
		    checkRes.add("White");
		    temp.add(gch);
		}
	    }
	    if (gch != rch && !r.contains(gch)) {
		checkRes.add(" ");
	    }
	}
	Collections.shuffle(checkRes);
	System.out.println(checkRes);
	System.out.println(r);
	return checkRes;
	
    }
}
