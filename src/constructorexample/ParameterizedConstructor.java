package constructorexample;

public class ParameterizedConstructor {

	int id;
	String name;
	
	ParameterizedConstructor (int i, String s)
	
	{
		id = i;
		name = s;
	}
	
	void Print()
	{
		System.out.println(id);
		System.out.println(name);
	}
	 public static void main(String args[])
	 
	 {
		 ParameterizedConstructor ps = new ParameterizedConstructor (456, "name1;");
		 ParameterizedConstructor ps1 = new ParameterizedConstructor (876, "name2");
		 
		 ps.Print();
		 ps1.Print();
				 
	 }
}
