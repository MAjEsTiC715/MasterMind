import java.util.ArrayList;
import java.util.List;
/**
 * The subclass Random generates a guess from object Code
 */
public class Random extends Player {
    @Override
    public String getGuessR(int cl, int d) {
	Code random = new Code();  // Create the random guess
	random.setCodeLength(cl);
	random.setDuplicate(d);
	ArrayList<Character> guessList = random.Code();

	/** Creates a string out of character arraylist */
	StringBuilder sb = new StringBuilder();  // The new string
	for (char ch : guessList) {
	    sb.append(ch);
	}
	
	String guess = sb.toString(); // piece together the characters into a string
	return guess;
    }
}
