package thiskeywordexaples;

public class ThisKeyWordConstructor {

	ThisKeyWordConstructor()
	{
		this(5); //() is used because this is parameterized constructor
		System.out.println("This is constructor1");
	}
	
	ThisKeyWordConstructor(int a)
	{
		//this() //if want to call default constructor from line5 comment line 7
		System.out.println(3);
	}

	public static void main(String[] args) {
		ThisKeyWordConstructor ks1 = new ThisKeyWordConstructor();
		
	}
}
