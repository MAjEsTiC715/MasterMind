import java.util.Random;
import java.util.ArrayList;

public class PatternGenerator {
    private int codeLength;
    private final char RED = 'R';
    private final char BLUE = 'B';
    private final char YELLOW = 'Y';
    private final char PURPLE = 'P';
    private final char BLACK = 'K';
    private final char GREEN = 'G';
    private final char ORANGE = 'O';
    private final char PINK = 'I';
    private final char TORQUOISE = 'T';
    private final char BROWN = 'W';
    private ArrayList<Character> answer = new ArrayList<Character>();
    private boolean duplicates;

    public PatternGenerator(int codeLength, boolean duplicates) {
	this.codeLength = codeLength;
	this.duplicates = duplicates;
    }

    public void setAnswer(ArrayList<Character> answer) {
	this.answer = answer;
    }
    
    public ArrayList<Character> getCode(int codeLength, ArrayList<Character> answer, boolean duplicates) {
	Random rand = new Random();

	char [] colorBalls = {RED, BLUE, YELLOW, PURPLE, BLACK, GREEN, ORANGE, PINK, TORQUOISE, BROWN};
	ArrayList<Character> checkList = new ArrayList<Character>();

	if (duplicates == true) {
	
	    for (int i = 0; i < codeLength; i++){
		int n = rand.nextInt(codeLength) + 0;
		char c = colorBalls[n];
		answer.add(c);
	    }
	    
	    return answer;
	}
	else  {
	    int j = 0;
	    while (j < codeLength) {
		int n = rand.nextInt(codeLength) + 0;
		char c = colorBalls[n];
		checkList.add(c);
		for (char x : checkList) {
		    if (!answer.contains(x)) {
			answer.add(c);
			j++;
		    }
		}
	    }
	    return answer;
	}
    }

    public ArrayList<Character> getAnswer() {
	return answer;
    }
}
    
    

    

