package stringexample;

public class StringImmutable {

	public static void main(String args[])
	{
	String s = "Raj";
	
	s.concat("Kumar");
	
	{
		//System.out.println(s);
		System.out.println(s.concat("Kumar")); //this will print 'RajKumar' though immutable, it will create a new memory
	}
}
}