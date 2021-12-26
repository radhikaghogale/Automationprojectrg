package thiskeywordexaples;

public class ThisKeyWordMethod {

	void method1()
	{
		System.out.println("Hello");
	}
	
	void method2 ()
	{
		System.out.println("Method2"); // cALLING METHOD 1 IN METHOD 2 JAVA CONSIDERES WORD 'THIS' AS DEFAULT
		this.method1(); //this is default word and not mandatory
		//method1(); //this is same as this.method1();  will consider as method1
	}
	
	public static void main(String[] args) {
		ThisKeyWordMethod km1 = new ThisKeyWordMethod();
		km1.method1();
		km1.method2();
	}
}
