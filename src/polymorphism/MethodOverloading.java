package polymorphism;

public class MethodOverloading { //calculator example same return type for methods and can have multiple datatype in aruments
	

	public float add (int a, int b)
	
	{
	System.out.println(a+b);
	return a+b;
	}
	
	public float add (float a , float b, float c)
	{
		System.out.println(a+b+c);
		return a+b+c;
	
	}
	
	public float add (float a , float  c)
	
	{
		System.out.println(a+c);
		return a+c;
	}
	
	public static void main(String args[])
	
	{
		MethodOverloading md1 = new MethodOverloading();
		md1.add(12.4f, 1.6f);
		md1.add(1, 2, 3);
		md1.add(5, 6);
	}
}


