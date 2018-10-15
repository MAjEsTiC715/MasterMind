public class GameLauncher {
    public static void main(String[] args) {
	int player = Integer.parseInt(args[0]);
	int codeLength = Integer.parseInt(args[1]);
	int tries = Integer.parseInt(args[2]);
	int duplicate = Integer.parseInt(args[3]);
	
	new MasterMind(player, codeLength, tries, duplicate);
    }
}
