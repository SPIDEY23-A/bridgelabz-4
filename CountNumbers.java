package ControlFlow_L1;

import java.util.Scanner;

public class CountNumbers {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the) value for countdown: ");
		int Counter = input.nextInt();
		
		while (Counter >=1) {
			System.out.print(Counter + "....");
			Counter--;
			
		}
		
		System.out.println("Launch");
		
		input.close();
		
		
	}

}
