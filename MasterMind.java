import java.util.ArrayList;
import java.util.Scanner;
/**
 * The Main class for the MasterMind game
 * It acts as the overall controller of the game 
 */
public class MasterMind {
    private int start = 1;
    private int codeLength;
    private int player;
    private int tries;
    private int duplicate;
    private boolean finish;   // the sentinel for exiting the game
    private Code code;        // the color code
    private Player human;     // the human player
    private Player random;    // the random player
    private History history;  // keeps track of players guesses
    private ArrayList<String> pegs = new ArrayList<>();
    private ArrayList<String> checkRes = new ArrayList<>();    // the result in peg form, comes from checking the guess
    private ArrayList<String> historyList = new ArrayList<>();
    private ArrayList<Character> result = new ArrayList<>();

    /** Constructor to setup the game */
    public MasterMind(int codeLength, int duplicate, int tries, int player) {
	// Initialize the player and history objects 
	initGame(player, codeLength, tries, duplicate);
	
	// Play the game once but lasts until the number of tries is met or finish is true
	do {
	    playerTurn(player, codeLength, duplicate); // Get new guess from player
	    updateGame(result, player, pegs, checkRes); // Check guess and update results

	    start++;
	}while (start <= tries && finish == false);

	if (finish == false && start > tries) {
	    System.out.println("Game Over! The secret code was: " + result + "\nYour guess history was: " + historyList);
	}
    }

    /** Creates the player, code, and paramaters for the game */
    public void initGame(int player, int codeLength, int tries, int duplicate) {
	history = new History();
	
	code = new Code();
	code.setCodeLength(codeLength);
	code.setDuplicate(duplicate);
	result = code.Code();                   // the answer the player must guess correctly
	
	for (int i = 0; i < codeLength; i++) {
	    pegs.add("Black");                  // the amount of black pegs that checkRes must equal
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
	if (tries > 50 | tries < 1 | player < 1 | player > 3) {
	    System.out.println("Number of guess is limited to 1-50 and player is between 1-3.");
	    System.exit(0);
	}
    }

    /** The player makes a guess with input validation and adds guess to history of guesses */
    public void playerTurn(int player, int codeLength, int duplicate) {
	boolean validInput = false;      // for validating input
	do {
	    if (player == 1) {
		String guess = human.getGuessH();
		human.setGuess(guess);
		history.setHistory(guess);
		historyList = history.History();
		validInput = true;
	    }
	    if (player == 2) {
		String guess = random.getGuessR(codeLength, duplicate);
		random.setGuess(guess);
		history.setHistory(guess);
		historyList = history.History();
		validInput = true;
	    }
	    if (player == 3) {
		validInput = true;
	    }
	} while (!validInput);
    }

    /** Update game with guess and check between guess and result */
    public void updateGame(ArrayList<Character> result, int player, ArrayList<String> pegs, ArrayList<String> checkRes) {
	if (player == 1) {
	    checkRes = human.check(result);    // gets pegs based on guess
	    if (checkRes.equals(pegs)) {       // checks for win
		System.out.println("You Win! The secret code was: " + result + "\nYour guess history was: " + historyList);
		finish = true;
	    }
	    // Otherwise continue with game
	    else {
		System.out.println("Pegs: "+ checkRes);
	    }
	    
	}
	if (player == 2) {
	    checkRes = random.check(result);   // gets pegs based on guess
	    if (checkRes.equals(pegs)) {       // checks for win
		System.out.println("You Win! The secret code was: " + result + "\nYour guess history was: " + historyList);
		finish = true;
	    }
	    // Otherwise continue with game
	    else {
		System.out.println("Pegs: " + checkRes);
	    }
	}
	if (player == 3) {
	    System.out.println("Coming Soon");
	}
    }
}
