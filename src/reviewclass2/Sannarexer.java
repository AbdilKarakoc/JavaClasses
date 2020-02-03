package reviewclass2;

import java.util.Scanner;

public class Sannarexer {

	public static void main(String[] args) {


		Scanner keybInput=new Scanner(System.in);
		
		//control+shift+o
		// Scanner is a c lass present in Java.util package
		//which allows us to take user input.
		
		System.out.print("Enter your name:");
		String nane= keybInput.next();
		
		System.out.println("Hey" +nane);
		
	}

}
