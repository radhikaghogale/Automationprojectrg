package statickeywordsexamples;

public class StaticVariablExample {

	
	int count = 0; // this is instance variable . will allocate everytime when method is called hence it will print 1,1,1
	
	//static int count; // this is static variable will allocate only once hence it will print 1,2,3
	{
		count++;
	}
	
	void getcount()
	{
		System.out.println("Value of counter:" + count);
	}
	public static void main(String[] args) {
	
		StaticVariablExample sv1 = new StaticVariablExample();
		sv1.getcount();
		StaticVariablExample sv2 = new StaticVariablExample();
		sv2.getcount();
		StaticVariablExample sv3 = new StaticVariablExample();
		sv3.getcount();
		
		
		
	}
}
