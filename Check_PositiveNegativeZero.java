package ControlFlow_L1;

import java.util.Scanner;

public class Check_PositiveNegativeZero {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
		if(number > 0) {
			System.out.print("Postive");
		}
		
		else if (number < 0) {
			System.out.print("Negative");
		}
		
		else {
			System.out.print("Zero");
		}
		
		input.close();
	}

}
