package constructorexample;

public class DefaultConstructorEx2 {

	
	int id;
	String name;
	
	void display ()
	
	{
		System.out.println(id + " " + name);
	}
	
	public static void main (String args[])
	
	{
		DefaultConstructorEx2 ds1 = new DefaultConstructorEx2();
		DefaultConstructorEx2 ds2 = new DefaultConstructorEx2();
		
		ds1.display();
		ds2.display();
	}
}
