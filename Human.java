import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Human extends Player {
    @Override
    public String getGuess() {
	String g;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter you guess: ");
	g = input.nextLine();
	System.out.println("Guess who" + g);
	return g;
    }
}
