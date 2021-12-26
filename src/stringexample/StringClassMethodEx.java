package stringexample;

public class StringClassMethodEx {

	public static void main (String args[])
	
	{
		String s = "My name is Radhika Ghogale";
		String sn = "Ghogale Radhika is name My";
		
		//1. Length Method
		
		int lngth = s.length();
		System.out.println("Length of the String is " + lngth);
		
		int lengtht = sn.length();
				System.out.println("Length of sn String is " + lengtht);
		
		
		//2. CharAt Method
		
		char charatt = s.charAt(13);
		
		System.out.println("Character at particular index is "+ charatt);
		
		char charatt1 = sn.charAt(5);
		System.out.println("Character at length 5 is " + charatt1);
		
		//3. Substring
		
	String fullname	= s.substring(11);
		System.out.println("Substring:- " + fullname );
		String name = s.substring(11,19);
		System.out.println("Substring:-" + name);
		
		//4. equal Method
		
		String s1 = "Radhika";
		String s2 = "Mrunali";
		boolean eqlt = s1.equals(s2);
		//boolean eqlt = s1.equals(eqlt);
		
		System.out.println("equals method:-" + eqlt );
		
		//Contains
		boolean	cnts = s1.contains(s2);
		System.out.println("contains method:-" +cnts);
		
		
		//index of, last indexof
	  
	
		int method1 = s.indexOf(15);
		System.out.println("Index of Method 1:-" + s.indexOf('a') );
		int method2 = s.indexOf(2);
		System.out.println("Index of Method 2:-" + s.indexOf('a', 6) );
		int method3 = s.indexOf(8);
		System.out.println("Index of Method 3:-" + s.indexOf("is") );
		int  method4 = s.lastIndexOf(2);
		System.out.println("Last Index of Method 4:-" + s.lastIndexOf('a'));
		
		//concat method
		
		String con1 = "Radhika";
		String con2 = "Ghogale"	;
		System.out.println("Concat:-" + con1.concat(con2));
		
		// replace Method
		
		System.out.println("Replace:-" + s.replace("Radhika", "Radh"));
		
		// uppercase lowercase method
		System.out.println("Uppercase:-" + s.toUpperCase());
		System.out.println("Lowercase:-" + s.toLowerCase());	
		
		//Split method
		
		String [] splt = s.split(" ");
		for (String a : splt)
		{
			System.out.println("Eachvalue of Splitted String:- " + a);
		}
		
		String [] splt2 = sn.split(" ");
		for (String b : splt2)
			
		{
			System.out.println("Each value of Splitted string - " + b);
		}
		
		//Join method
		
		String joinm = s.join("<", "four","Five","Six", "Seven");
		{
			System.out.println("Join example:-" + joinm);
		}
		
		String  joinm2 = s.join(" ", "Ghogale" , "Radhika" , "is" , "name" , "My");
		{
			System.out.println("Practice 1 output- " + joinm2);
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
