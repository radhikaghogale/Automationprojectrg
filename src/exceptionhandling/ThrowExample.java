package exceptionhandling;

public class ThrowExample {

	public static void validate (int age)
	{
		if (age<18)
		{
			throw new ArithmeticException ("Person is not eligible to vote");
		}
		else 
		{
			System.out.println("Person is eligible to vote");
		}
	}
	//main method
	public static void main(String[] args) {
		//calling the function (static method)
		
		validate(18); // any value below 18 will throw exception
		System.out.println("rest of the code");
	}
}
