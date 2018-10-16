public class GameLauncher {
    // Create an instance of MasterMind and runs it
    public static void main(String[] args) {
	int codeLength = Integer.parseInt(args[0]);
	int duplicate = Integer.parseInt(args[1]);
	int tries = Integer.parseInt(args[2]);
	int player = Integer.parseInt(args[3]);
	
	new MasterMind(codeLength, duplicate, tries, player);
    }
}
