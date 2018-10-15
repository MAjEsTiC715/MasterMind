import java.util.ArrayList;
import java.util.List;

public class Random extends Player {
    @Override
    public String getGuessR(int cl, int d) {
	Code random = new Code();
	random.setCodeLength(cl);
	random.setDuplicate(d);
	ArrayList<Character> guessList = random.Code();
	
	StringBuilder sb = new StringBuilder();
	for (char ch : guessList) {
	    sb.append(ch);
	}
	
	String guess = sb.toString();
	return guess;
    }
}
