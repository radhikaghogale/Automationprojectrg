package inheritence;

public class SingleInheritenceImplementation extends SingleInheritence {

	float bonus = 15000;
	
	void xyz()
	
	{
		System.out.println("child class method");
		
	}
	
	public static void main(String args[])
	
	{
		SingleInheritenceImplementation sh = new SingleInheritenceImplementation();
		System.out.println(sh.salary);
		System.out.println(sh.bonus);
		
		sh.abc();
		sh.xyz();
		
		
	}
}

