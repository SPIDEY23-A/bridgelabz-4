package ControlFlow_L1;

import java.util.Scanner;

public class Divisibiltyby5 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int number = input.nextInt();
		
		if(number%5==0) {
			System.out.println(+number + " is Divisible by 5");
		}
		
		else {
			System.out.println(+number + " is not divisible by 5");
			
		}
		
		input.close();
		
		
	}

}
