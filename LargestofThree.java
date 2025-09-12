package ControlFlow_L1;

import java.util.Scanner;

public class LargestofThree {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int number1 = input.nextInt();
		
		System.out.print("Enter second number : ");
		int number2 = input.nextInt();
		
		System.out.print("Enter third number : ");
		int number3 = input.nextInt();
		
		boolean isFirstLargest = (number1 >= number2) && (number1 >= number2);
		boolean isSecondLargest = (number2 >= number1) && (number2 >= number3);
		boolean isThirdLargest = (number3 >= number1) && (number3 >= number2) ;
		
		System.out.println("Is first the largest ? " +isFirstLargest);
		System.out.println("Is second the largest ? " +isSecondLargest);
		System.out.println("Is third the largest ? " +isThirdLargest );
		
		input.close();
		
				
	}

}
