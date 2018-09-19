public class Test {
    public static void main(String[] args){
	PatternGenerator play = new PatternGenerator(7, true);
	
      	int l = play.getCodeLength();
       	String a = play.getAnswer();
       	String b = play.getColorBalls();
	boolean d = play.getDuplicates();
	
	System.out.println(play.getCode(l, b, a, d));
    }
}
