package conditionalstatementsandloops;

import java.util.Scanner;

public class IfElseExample {
	
	public static void main (String args[]){
		//This is used to get runtime input from a user, this is a class
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter a name");
		
		int number = sc.nextInt();
		
		if (number%2==1) 
		{
			System.out.println("even number");
		}
		
		
		 else if (number*2==4)
		{
			System.out.println("This is never possible");
		}
		
		else 
		{
			System.out.println("odd number");
		}
	}

}
