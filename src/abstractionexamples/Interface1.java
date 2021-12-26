package abstractionexamples;

public interface Interface1 {

	//will give compilation error if we try to chande
	
	int x = 10; // same as --- public static final int x = 10; value of x will not change as its final
	
	public void method1(); //same as public abstract void method1();
	public void method2(); //same as public abstract void method1();
}

