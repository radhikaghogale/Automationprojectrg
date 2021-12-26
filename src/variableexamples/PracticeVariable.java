package variableexamples;

public class PracticeVariable {

	public String var1;
	
	public int var2;
	
	public void method1 (String abc1)
	{
		
		var1 = abc1;
	}

	public void method2 (int xyz)
	{
		var2 = xyz;
		
	}
	
	public void method3()
	{
		System.out.println(var1);
		System.out.println(var2);
	}
	
	public static void main(String args[])
	
	{PracticeVariable pv = new PracticeVariable();
	pv.method1("Radhika");
	pv.method2(7000);
	pv.method3();}
	
}


