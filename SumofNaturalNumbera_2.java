package ControlFlow_L1;

import java.util.Scanner;

public class SumofNaturalNumbera_2 {
	public  static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		double total = 0.0;
		double number;
		
		System.out.print("Enter Number to Sum: ");
		
		while(true) {
			number = input.nextDouble();
			if(number <= 0) {
				break;
			}
			
			total += number;
			System.out.print("Enter next number to add : ");
			
		}
		
		System.out.print("Sum is : " +total);
		input.close();
		
	
	}

}
