import java.util.ArrayList;
import java.util.Scanner;

public class MasterMind {
    private int start = 1;
    private int codeLength;
    private int player;
    private int tries;
    private int duplicate;
    private boolean finish;
    private Code code;
    private Player human;
    private Player random;
    private ArrayList<String> pegs = new ArrayList<>();
    private ArrayList<String> checkRes = new ArrayList<>();
    private ArrayList<Character> result = new ArrayList<>();

    private static Scanner input = new Scanner(System.in);

    // Constructor to setup the game
    public MasterMind(int player, int codeLength, int tries, int duplicate) {
	code = new Code();
	code.setCodeLength(codeLength);
	code.setDuplicate(duplicate);
        result = code.Code();

	// Initialize the player objects 
	initGame(player, codeLength);
	// Play the game once but lasts until the number of tries is met
	do {
	    playerTurn(player, codeLength, duplicate); // Get new guess from player
	    updateGame(result, player, pegs, checkRes); // Check guess and update results

	    start++;
	}while (start <= tries && finish == false);

	if (finish == false && start > tries) {
	    System.out.println("Game Over! The secret code was: " + result);
	}
    }

    public void initGame(int player, int codeLength) {
	for (int i = 0; i < codeLength; i++) {
	    pegs.add("Black");
	}
	
	if (player == 1) {
	    human = new Human();
	}
	if (player == 2) {
	    random = new Random();
	}
	if (player == 3) {
	    System.out.println("not done");
	}
    }
    public void playerTurn(int player, int codeLength, int duplicate) {
	boolean validInput = false;
	do {
	    if (player == 1) {
		String guess = human.getGuessH();
		human.setGuess(guess);
		validInput = true;
	    }
	    if (player == 2) {
		String guess = random.getGuessR(codeLength, duplicate);
		random.setGuess(guess);
		validInput = true;
	    }
	    if (player == 3) {
		validInput = true;
	    }
	} while (!validInput);
    }

    public void updateGame(ArrayList<Character> result, int player, ArrayList<String> pegs, ArrayList<String> checkRes) {
	if (player == 1) {
	    checkRes = human.check(result);
	    if (checkRes.equals(pegs)) {
		System.out.println("You Win! The secret code was: " + result);
		finish = true;
	    }
	    else {
		System.out.println("Pegs: "+ checkRes);
	    }
	    
	}
	if (player == 2) {
	    checkRes = random.check(result);
	    if (checkRes.equals(pegs)) {
		System.out.println("You Win! The secret code was: " + result);
		finish = true;
	    }
	    else {
		System.out.println("Pegs: " + checkRes);
	    }
	}
	if (player == 3) {
	    System.out.println("Coming Soon");
	}
    }
}
