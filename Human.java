import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Human extends Player {
    @Override
    public String getGuessH() {
	String guess;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter you guess: ");
	guess = input.nextLine();
	return guess;
    }
}
