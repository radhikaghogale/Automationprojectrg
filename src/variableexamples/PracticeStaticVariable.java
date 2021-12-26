package variableexamples;

public class PracticeStaticVariable {

	String name;
	
	int rollnumber;
	
	static String collegename = "SNDT";
	
	PracticeStaticVariable (String n , int r)
	{
		name = n;
		rollnumber = r;
	}
	
	public void methodtoprint ()
	
	{
		System.out.println(name);
		System.out.println(rollnumber);
		System.out.println(collegename);
	}
	
	public static void main(String[] args) 
	{
		PracticeStaticVariable psv = new PracticeStaticVariable("Radhika" , 77);
		PracticeStaticVariable psv1 = new PracticeStaticVariable("Rishaan" , 78);
		PracticeStaticVariable psv2 = new PracticeStaticVariable("Raviraj" , 79);
		
		psv.methodtoprint();
		psv1.methodtoprint();
		psv2.methodtoprint();
		
	}
}
