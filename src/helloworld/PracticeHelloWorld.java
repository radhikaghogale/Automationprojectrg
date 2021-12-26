package helloworld;

public class PracticeHelloWorld {

	public static void main (String args[])
	
	{
		System.out.println("Hello world");
		PracticeHelloWorld phw = new PracticeHelloWorld();
		int a = phw.firstmethod(5, 6);
		System.out.println(a);
		phw.secondmethod();
		int d = phw.add(7, 8);
		System.out.println(d);
		phw.printadd();
		//phw.add(7, 8);
		
		
	}
	
	public int firstmethod(int x, int y)
	{
		int z = x*y;
		return z;
	}
	
	public void secondmethod()
	{
		System.out.println("seconmethod");
		}
	
	public int add (int a , int b )
	{
		int c = a+b;
		return c;
		
	}

	public void printadd()
	{
		System.out.println("result of addition is c");
	}
}
