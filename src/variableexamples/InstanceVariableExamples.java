package variableexamples;

public class InstanceVariableExamples {
	
	//This is instance variable
	public String var1;
	
	///This is instance variable
	
	private int var2;
	

	public void method1 (String abc1)
	
	{
		var1 = abc1;
	}
	
	void method2 (int abc2)
	
	{
		var2 = abc2;	
	}
	
	void method3()
	{
		System.out.println(var1);
		System.out.println(var2);
		
	}
	public static void main(String args[])
	
	{
		InstanceVariableExamples ive = new InstanceVariableExamples();
		ive.method1("Radhika");
		ive.method2(70000);
		ive.method3();
		
	}
}
