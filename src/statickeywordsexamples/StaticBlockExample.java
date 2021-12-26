package statickeywordsexamples;

public class StaticBlockExample {

	
	static //this is static block purpose is for memory saving
	
	{
		System.out.println("static block is invoked"); //Static block will get execute BEFORE Main Method always
		
	}
	public static void main(String[] args) {
		{
			System.out.println("Hello Main");
		}
	}
}
