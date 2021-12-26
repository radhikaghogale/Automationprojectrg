package polymorphism;

public class MethodOverridingImplementation extends MethodOverriding1 {

	int speedlimit = 150; // overriding can not happen on variable/data type. it can happen only on methods
	
	void abc()
	{
		System.out.println("extended class");
	}
	
	void xyz()
	
	{
		System.out.println(speedlimit);
		System.out.println(super.speedlimit);
	}
	
	public static void main(String args[])
	{
		MethodOverriding1 mr = new MethodOverridingImplementation();
		System.out.println(mr. speedlimit);
		mr.abc();
	//mr.cde()---no mr.cde method
		
		MethodOverridingImplementation mr1 = new MethodOverridingImplementation();
		System.out.println(mr1. speedlimit);
		mr1.abc();
		mr1.xyz();
	}
}
