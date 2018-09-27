public class Test {
    public static void main(String[] args){
	PatternGenerator play = new PatternGenerator(10, false);
	
      	int l = play.getCodeLength();
       	char[] b = play.getAnswer();
	boolean d = play.getDuplicates();
	
	System.out.println(play.getCode(l, b, d));
    }
}
