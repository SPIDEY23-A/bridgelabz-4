package ControlFlow_L1;

import java.util.Scanner;

public class VoteEligibility {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Age : ");
		int Age = input.nextInt();
		
		if(Age >= 18) {
			System.out.println("The person's age is " +Age + " and is eligible to vote.");
			
		}
		
		else {
			System.out.println("The person's age is " +Age + " and can not vote.");
		}
		
		input.close();
	}

}
