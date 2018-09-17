import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class PatternGenerator {
    private int codeLength;
    private String colorBalls = "RBYPKGO";
    private String answer = "";
    private boolean duplicates;

    public PatternGenerator(int codeLength, boolean duplicates){
	this.codeLength = codeLength;
	this.duplicates = duplicates;
    }
    
    public void setAnswer(String answer){
	this.answer = answer;
    }

    public void setColorBalls(String colorBalls) {
	this.colorBalls = colorBalls;
    }
    
    public String getCode(int codeLength, String colorBalls, String answer, boolean duplicates){
	Random rand = new Random();
	
	char[] answerList = {};
	char[] checkList = {};

	if (duplicates == true) {
	
	    for (int i = 0; i < codeLength; i++){
		int n = rand.nextInt(codeLength) + 0;
		char c = colorBalls.charAt(n);
		answerList[i] += c;
	    }
	    String a = new String(answerList);
	    answer = a;
	    
	    return answer;
	}
	else {
	    for (int j = 0; j < codeLength; j++){
		int n = rand.nextInt(codeLength) + 0;
		char c = colorBalls.charAt(n);
		checkList[j] += c;
		if (checkList.equals(answerList)) {
		    System.out.println("why");
		    j--;
		}
		else {
		    answerList[j] += c;
		}
	    }
	    String a = new String(answerList);
	    answer = a;
	    return answer;
	}
    }

    public int getCodeLength() {
	return codeLength;
    }

    public String getAnswer() {
	return answer;
    }

    public Boolean getDubplicates() {
	return duplicates;
    }
}
    
    

    

