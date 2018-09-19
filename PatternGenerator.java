import java.util.Random;

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
    
    public String getCode(int codeLength, String colorBalls, String answer, boolean duplicates){
	Random rand = new Random();
	
	String answerList = "";
	String checkList = "";

	if (duplicates == true) {
	
	    for (int i = 0; i < codeLength; i++){
		int n = rand.nextInt(codeLength) + 0;
		char c = colorBalls.charAt(n);
		answerList += (c + "\t");
	    }
	    String a = new String(answerList);
	    answer = a;
	    
	    return answer;
	}
	else  {
	    for (int j = 0; j < codeLength; j++){
		int n = rand.nextInt(codeLength) + 0;
		char c = colorBalls.charAt(n);
		String s = Character.toString(c);
		checkList += (c + "\t");
		if (checkList.contains(s)) {
		    System.out.println("why");
		    //j--;
		}
		else {
		    answerList += (c + "\t");
		}
	    }
	    System.out.println(checkList + "\n" + answerList);
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

    public String getColorBalls() {
	return colorBalls;
    }

    public Boolean getDuplicates() {
	return duplicates;
    }
}
    
    

    

