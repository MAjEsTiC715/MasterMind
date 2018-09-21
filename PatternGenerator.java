import java.util.Random;

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
    private char[] answer = {};
    private boolean duplicates;

    public PatternGenerator(int codeLength, boolean duplicates){
	this.codeLength = codeLength;
	this.duplicates = duplicates;
    }

    public void setAnswer(String answer) {
	this.answer = answer;
    }
    
    public String getCode(int codeLength, char[] answer, boolean duplicates) {
	Random rand = new Random();

	char [] colorBalls = {RED, BLUE, YELLOW, PURPLE, BLACK, GREEN, ORANGE, PINK, TORQUOISE, BROWN};
	char [] answerList = {codeLength};
	char [] checkList = {RED, BLUE, YELLOW, PURPLE, BLACK, GREEN, ORANGE, PINK, TORQUOISE, BROWN};

	if (duplicates == true) {
	
	    for (int i = 0; i < codeLength; i++){
		int n = rand.nextInt(codeLength) + 0;
		char c = colorBalls.get(n);
		answerList[i] = c;
	    }
	    answer = answerList;
	    
	    return answer;
	}
	else  {
	    for (int j = 0; j < codeLength; codeLength--){
		int n = rand.nextInt(codeLength) + 0;
		char c = colorBalls.get(n);
		for (char ch : checkList) {
		    answerList[j] = ch;
		}
	    }
	    answer = answerList;
	    return answer;
	}
    }

    public String checkCode(char[] answer, String guess) {

    }

    public int getCodeLength() {
	return codeLength;
    }

    public String getAnswer() {
	return answer;
    }

    public Boolean getDuplicates() {
	return duplicates;
    }
}
    
    

    

