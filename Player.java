java.util.*;

public class Player {
    private String guess = "";

    public void setGuess(String g) {
	this.guess = g;
    }

    public String getGuess(String g) {
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter your guess: ");
	g = reader.nextString();
	return g;
    }
}
