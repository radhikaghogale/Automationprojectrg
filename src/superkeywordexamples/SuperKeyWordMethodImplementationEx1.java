package superkeywordexamples;

public class SuperKeyWordMethodImplementationEx1 extends SuperKeyWordMethodEx1 {
	
	void method1()
	{
		System.out.println("I am a child method");
	}

	void print ()
	{ 
		method1();
		super.method1();
		
		
	}
	public static void main(String[] args) {
		SuperKeyWordMethodImplementationEx1 sm1 = new SuperKeyWordMethodImplementationEx1();
		sm1.print();
	}
}
