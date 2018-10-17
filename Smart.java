import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Smart extends Player {
        String[] _ValidDigits = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        ArrayList<String> _PossibleTokens;
        String _LastMove;
 
 
        private ArrayList<String> GetAllPossibleTokens() {	    
            ArrayList<String> tokens = new ArrayList<String>();
	    
            for (int d1 = 0; d1 < _ValidDigits.length; d1++) {
                for (int d2 = 0; d2 < _ValidDigits.length; d2++) {
                    for (int d3 = 0; d3 < _ValidDigits.length; d3++) {
                        for (int d4 = 0; d4 < _ValidDigits.length; d4++)
                        {
                            if (d1 != d2 && d1 != d3 && d1 != d4 && d2 != d3 && d2 != d4 && d3 != d4) {

                                tokens.add((_ValidDigits[d1] + _ValidDigits[d2] + _ValidDigits[d3] + _ValidDigits[d4]));
                            }
                        }
		    }
		}
	    }
            return tokens;
        }
        private String PrunePossibleMovesForTheAnswer(String guess, String answer) {
            for (int i = 0; i < _PossibleTokens.size(); i++) {
                String token = _PossibleTokens.get(i);
                if (AnswerToGuess(token, guess) != answer)
                    _PossibleTokens.remove(i--);
            }
        }
        private String AnswerToGuess(String token, String guess)
        {
            int p = 0, m = 0;
 
            for (int i = 0; i < guess.length(); i++)
            {
                int pos = token.indexOf(guess.charAt(i));
                if (pos >= 0)
                {
                    if (pos == i) p++;
                    else m++;
                }
            }
            return "+" + p + "-" + m;
        }
        
 
        public String MakeMove()
        {
	    Random rand = new Random();
	    int num = rand.nextInt(_PossibleTokens.size());
            _LastMove =  _PossibleTokens.get(num);
            return _LastMove;
        }
 
        public String StartGame()
        {
	    Random rand = new Random();
	    _PossibleTokens = GetAllPossibleTokens();
	    int num = rand.nextInt(_PossibleTokens.size());
            _LastMove = "";
            return _PossibleTokens.get(num); 
        }
 
        public String TakeAnswer(String answer)
        {
            if (_LastMove != null | _LastMove != "")
            {
                PrunePossibleMovesForTheAnswer(_LastMove, answer);
            }   
        }

    public static void main(String[] args) {
	Smart play = new Smart();
	play.StartGame();
	play.MakeMove();
	System.out.println(play.TakeAnswer("0258"));
    }
}
