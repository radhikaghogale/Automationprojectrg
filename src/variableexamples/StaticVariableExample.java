package variableexamples;

public class StaticVariableExample {

	int rollnumber;
	String name;
	static String collegename = "OIST" ; //this is a static variable will get memory only once
	
	StaticVariableExample (int r, String n) //this is a constructor because class name is same as method name
	{
		rollnumber = r;
		name = n;
		
	}
	
	void toPrint ()
	{
		System.out.println(rollnumber);
		System.out.println(name);
		System.out.println(collegename);
	}
	
	public static void main(String args[])
	
	{
		StaticVariableExample sve1 = new StaticVariableExample(1234, "Radhika");
		StaticVariableExample sve2 = new StaticVariableExample (56789 , "Radhika2");
		
		sve1.toPrint();
		sve2.toPrint();
	}
}
