package homework;

public class PrimeNumber2 {

	public static boolean isPrimeNumber (int num)
	{
		if (num <=1)
		{
			return false;
		}
		
		for (int i = 2; i<num ; i++)
			if (num % i ==0)
			{
				return false;
				
			}
		return true;
	}
	
	public static void main(String[] args) 
	{
		
		PrimeNumber2 ipm = new PrimeNumber2();
		ipm.isPrimeNumber(5);
		System.out.println(ipm);
				
				//System.out.println(isPrimeNumber(6));
	}
}
