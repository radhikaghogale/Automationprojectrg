package conditionalstatementsandloops;

import java.util.Scanner;

public class SwitchCaseEx {

	
	public static void main(String args[])
	
	{
		//Scanner sc = new Scanner (System.in);
		
		int num = 100;
				switch(num) {
				
				case 100:
					
				System.out.println ("Value of case 1 is " + num);
				//need to use break else it will goto next condition 
				break;
				
				case 200:
					
				System.out.println("Value if case 2 is " + num);
				
				break;
				
				default :
					System.out.println("Value of case 3 is " + num);
				}
				
	}
}
