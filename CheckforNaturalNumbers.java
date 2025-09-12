package ControlFlow_L1;

import java.util.Scanner;

public class CheckforNaturalNumbers {
	public static void main(String[]args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
			if (number >= 0) {
			long sum = (long) number * (number + 1) / 2;
			System.out.println("The Sum of " +number + " natural numbers is " +sum);
			}
			else {
				System.out.println("The number " +number + " is not a natural number. ");
				
				input.close();
				
				
			}
			
		}
	}


