package ControlFlow_L1;

import java.util.Scanner;

public class SumofNaturalNumbers {
	public  static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		double total = 0.0;
		System.out.print("Enter number for sum: ");
		double value = input.nextDouble();
		
		while( value != 0.0) {
			total += value;
			System.out.print("Enter next number : ");
			value = input.nextDouble();
		}
		
		System.out.print("Total Sum : " +total) ;
		
		input.close();
		
	}

}
