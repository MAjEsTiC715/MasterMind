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
    private char[] answer = new char [10];
    private boolean duplicates;

    public PatternGenerator(int codeLength, boolean duplicates) {
	this.codeLength = codeLength;
	this.duplicates = duplicates;
    }

    public void setAnswer(char[] answer) {
	this.answer = answer;
    }
    
    public char[] getCode(int codeLength, char[] answer, boolean duplicates) {
	Random rand = new Random();

	char [] colorBalls = {RED, BLUE, YELLOW, PURPLE, BLACK, GREEN, ORANGE, PINK, TORQUOISE, BROWN};
	char [] checkList = new char [10];

	if (duplicates == true) {
	
	    for (int i = 0; i < codeLength; i++){
		int n = rand.nextInt(codeLength) + 0;
		char c = colorBalls[n];
		answer[i] = c;
	    }
	    
	    return answer;
	}
	else  {
	    for (int j = 0; j < codeLength; j++) {
		int n = rand.nextInt(codeLength) + 0;
		char c = colorBalls[n];
		checkList[j] = c;
		for (char x : checkList) {
		    if (x != c) {
			System.out.println("HELLO");
			answer[j] = c;
		    }
		}
	    }
	    return answer;
	}
    }

    public int getCodeLength() {
	return codeLength;
    }

    public char[] getAnswer() {
	return answer;
    }

    public Boolean getDuplicates() {
	return duplicates;
    }
}
    
    

    

