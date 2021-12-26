package statickeywordsexamples;

public class StaticMethodExample {

	int a =10;
	static int b =20;
	
	static void abc()
	{
		System.out.println(b); //this is static method,can only call static variables, can not call non static 
	}
	
	void cde()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		StaticMethodExample sm1 = new StaticMethodExample();
		sm1.cde();
		System.out.println(b); // no instance required to give a call
		System.out.println(sm1.a);
		StaticMethodExample.abc(); // direct call given to static method
		
	}
}