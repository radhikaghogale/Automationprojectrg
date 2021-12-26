package abstractionexamples;

public class InterfaceImplementation implements Interface1 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.print("method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2");
	}

	public static void main(String args[])
	
	//int a=20; 
	
	//System.out.println(a);
	{
		Interface1 if1 = new InterfaceImplementation();
		if1.method1();
		if1.method2();
	}
}

