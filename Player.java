import java.util.Scanner;
import java.util.ArrayList;

public class Player {
    private String guess = "";

    public void setGuess(String g) {
	this.guess = g;
    }

    public String getGuess() {
	String g = "no guess";
	return g;
    }

    public ArrayList<String> check(String g, ArrayList<Character> r, boolean d) {
	System.out.println("nothing to check");

	ArrayList<String> nothing = new ArrayList<>();
	return nothing;
}
}
