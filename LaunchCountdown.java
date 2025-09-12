package ControlFlow_L1;

import java.util.Scanner;

public class LaunchCountdown {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter value for Countdown : ");
		int Counter = input.nextInt();
		
		for(int i = Counter; i>=1 ; i--) {
			System.out.println( i );
		}
		
		System.out.println("Launch");
		
		input.close();
		
	}

}
