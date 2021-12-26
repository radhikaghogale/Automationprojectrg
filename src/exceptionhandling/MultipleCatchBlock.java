package exceptionhandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		
		try 
		{
			int a[]=new int [5];
			a[3] =30/3;
			System.out.println("try block");
		}
		
		//catch(Exception e) {System.out.println("Common task completed");
		
		catch (ArithmeticException e)
		{
			System.out.println("Task 1 is completed");
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		
		{
			System.out.println("task 2 completed");
			
		}
		catch (Exception e)
		{
			System.out.println("Common task completed");
		}
		
		finally
		{
			System.out.println("This code will always executed");
		}
		
		System.out.println("rest of the code");
	}
}
