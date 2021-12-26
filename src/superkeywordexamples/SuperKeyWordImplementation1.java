package superkeywordexamples;

public class SuperKeyWordImplementation1 extends SuperKyrWordVariableEx1 {

	String abc = "I am in a child class";
	
	void display ()
	{
		System.out.println(abc);
		System.out.println(super.abc);
		
	}
	public static void main(String[] args) {
		SuperKeyWordImplementation1 ky1 = new SuperKeyWordImplementation1();
		ky1.display();
	}
}
