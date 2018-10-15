import java.util.Random;
import java.util.ArrayList;

public class Code {
    private int codeLength;
    private boolean duplicate;
    private final char RED = 'R';
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
	if (!(cl >= 2 && cl <= 10)) {
	System.out.println("Not a number between 2 and 10");
	}
	else {
	    codeLength = cl;
	}
    }

    public void setDuplicate(int d) {
	if (d == 0) {
	    duplicate = false;
	}
	else if (d == 1) {
	    duplicate = true;
	}
	else {
	    System.out.print("Not Valid");
	}
    }
    
    public int getCodeLength() {
	return codeLength;
    }
    public boolean getDuplicate() {
	return duplicate;
    }

    public ArrayList<Character> Code() {
	ArrayList<Character> answer = new ArrayList<>();
	ArrayList<Character> checkList = new ArrayList<>();
	char [] colorBalls = {RED, BLUE, YELLOW, PURPLE, BLACK, GREEN, ORANGE, INDIGO, TORQUOISE, WHITE};
	Random rand = new Random();
	
	if (getDuplicate() == true) {
	    for (int i = 0; i < getCodeLength(); i++) {
		int n = rand.nextInt(10);
		char c = colorBalls[n];
		answer.add(c);
	    }
	}
	else if (getDuplicate() == false) {
	    int j = 0;
	    while (j < getCodeLength()) {
		int n = rand.nextInt(10);
		char c = colorBalls[n];
		checkList.add(c);
		for (char x : checkList) {
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
