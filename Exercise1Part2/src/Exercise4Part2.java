

import java.util.Scanner;

public class Exercise4Part2 {

	public static void main(String[] args) {
		//The program below was written in an attempt to swap the value of two variables. However it does not give the desired result:
			
		// declare variables
			int x, y, aux;
		
			//declare Scanner
			Scanner keyboard = new Scanner(System.in);
			
			// enter values
			System.out.print("Enter value for x: ");
			x = keyboard.nextInt();
			System.out.print("Enter value for y: ");
			y = keyboard.nextInt();
			// code attempting to swap two variables
			aux = x;
			x = y;
			y = aux;
			//display results
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			
			keyboard.close();

		// TODO Auto-generated method stub

	    }
	}

