package variableexamples;

public class LocalVariableExamples {
	
	//This is Instance variable since It is inside class and outside method, constructor, block
		//String instanceVariable = "This is an instance variable";
	
	public static void main(String args[])
	{
		
//create instance to class to access member of it
	LocalVariableExamples lve = new LocalVariableExamples(); 
    //System.out.println (lve.localvariable);
    lve.firstmethod();
	
	}
	public void firstmethod()
	
	{
		String localvariable = "This is an local variable";
		
		//access modifier like public, protected, can not be assigned
		//public String abc1 = "access can not be used since This is a local variable" (this wont work)
		
		//static can not be assigend to local variable
		//static String xyz1 = "static can not be used since This is local variable" (no static is applied)
		
		// Value should be assigned before first use of local variable
		// String NoAssignedValue;
		//System.out.println (NoAssignedValue);
		//System.out.println();
		
	}
	
	
	
}

