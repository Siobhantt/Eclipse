package exercise1part2;

import java.util.Scanner;

public class Exercise1Part2 {

	public static void main(String[] args) {
		//First, we start the Scanner
			Scanner keyboard = new Scanner(System.in);
			
			//Then, we denominate the variables
			final int YEAR;
			int age, bornIn;
			
			//We have to print on the console the request to the user and save the variable
			System.out.print("How old are you this year? ");
			age = keyboard.nextInt();
			
			//Now we request to the user the years that`s running
			System.out.print("In which year are we? :");
			YEAR = keyboard.nextInt();
			
			//Now we write the operation and save it on the variable bornIn
			bornIn = YEAR - age;
			
			//We print the result on console
			System.out.println("I think you were born in " + bornIn);

			//close the scanner
			keyboard.close();
			
		// TODO Auto-generated method stub

	}

}
