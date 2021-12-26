package superkeywordexamples;

public class SuperConstructor1Imp extends SuperConstructor1{
	
	SuperConstructor1Imp (int c)
	{
		//super this is default taken by system
		super(10);//this is for parameterised constructor from parent
		
		System.out.println("Child Super class constructor");
	}
	
	public static void main(String args[])
	{
		SuperConstructor1Imp spc1 = new SuperConstructor1Imp(29);
		
		
	}

}
