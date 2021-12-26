package thiskeywordexaples;

public class ThisKeyWordExample1 {

	int rollno;
	String name;
	float fee;
	static String collegename = "OIST";
	ThisKeyWordExample1 (int rollno , String name, float fee)
	{
		this.rollno=rollno; // this key word differentiates instance variable and local variable because name is same
		this.name = name;
		this.fee = fee;
		
	}
	
	void display()
	{
		System.out.println(rollno +" " + name +" " + fee);
	}
	
	public static void main(String[] args) {
		System.out.println(collegename);
		ThisKeyWordExample1 tkw = new ThisKeyWordExample1 (123 , "Radhika" , 10000);
		tkw.display();
		ThisKeyWordExample1 tkw1 = new ThisKeyWordExample1 (456 , "Ghogale" , 20000);
		tkw1.display();
		System.out.println(collegename);
		
	}
}
