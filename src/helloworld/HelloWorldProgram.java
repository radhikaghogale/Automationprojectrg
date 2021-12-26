package helloworld;

public class HelloWorldProgram {

		public static void main(String args[])
		{
			System.out.println("hello world, welcome to tech bodhi");
			HelloWorldProgram hwp = new HelloWorldProgram ();
			hwp.add();
			int h = hwp.substract (20, 10);
			System.out.println (h);
			int a = hwp.substract (20,5);
			System.out.println(a);
			int e = hwp.multiply(5,6);
			System.out.println (e);	
			
			}
		


		public void add ()
		{
		System.out.println ("add");
	
		}

		public int substract (int a, int b)
		{
			int c = a-b;
			return c;
		}
		
		public int multiply (int c, int d)
		{
			int e = c*d;
			return e;
		}
}
