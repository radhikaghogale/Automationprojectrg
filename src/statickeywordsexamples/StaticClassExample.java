package statickeywordsexamples;

public class StaticClassExample { // This is outer class
	
	static String abc = "hello Alexa";
	String cde = "Hello Google";
			
			static class InnerclassStatic // this is inner static class
			{
				static void print()
				
				{
					System.out.println(abc);//can only use static methods or variables cant use cde (non static)
				}
				
				void method1()
				{
					System.out.println("Method1");
				}
			}
			
			public static void main (String args[])
			
			{
				StaticClassExample.InnerclassStatic.print(); //this is call to static method
				StaticClassExample.InnerclassStatic st1 = new StaticClassExample.InnerclassStatic(); 
				st1.method1(); //this method is inside static sub class
				
				StaticClassExample st2 = new StaticClassExample(); //instance created to normal method
						System.out.println(st2.cde);	//this is in outer class hence called in a regular way
						}
		 
	
}
