package exercise3part2;

import java.util.Scanner;

public class Exercise3Part2 {

	public static void main(String[] args) {
		//hat would be the final output from the program below if the user entered the number 10? :
			Scanner keyboard = new Scanner(System.in);
			int num1, num2;
			num2 = 6;
			System.out.print("Enter value: ");
			num1 = keyboard.nextInt();
			num1 = num1 + 2;
			num2 = num1 / num2;
			System.out.println("result = " + num2);

			keyboard.close();
		// TODO Auto-generated method stub

	}

}
