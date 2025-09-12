package ControlFlow_L1;

import java.util.Scanner;

public class SpringSeason {
	public static void  main(String[]args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter Month : ");
		int Month = input.nextInt();
		
		System.out.print("Enter Date : ");
		int Date = input.nextInt();
		
		if((Month == 3 && Date >=20 && Date <=31) ||
			(Month == 4 && Date >= 1 && Date <=30) ||
			(Month == 5 && Date >=1 && Date <=31) ||
			(Month == 6 && Date >= 1 && Date <=20))
		{System.out.print("It's Spring Season");
		
	}
		else {
			System.out.print("Not a Spring Season ");
		}
		
		input.close();
	}
}
