package abstractionexamples;

public class AbstractClass1Implementation extends AbstractClass1{

	@Override
	public void abstractmenthod1() {
		// TODO Auto-generated method stub
		System.out.println("abstract method 1 impplementation");
	}

	public static void main(String args[])
	{
		//AbstractClass1 ab = mew AbstractClass1();// can not create the instance
		
	AbstractClass1 ab1 = new AbstractClass1Implementation();
	ab1.abstractmenthod1();
	ab1.simplemethod1();
	
	//this is another way to create an instance for abstract method since AbstractClass1Implementation is not a abstract class we can create an instance in a regular way
	AbstractClass1Implementation abc = new AbstractClass1Implementation();
	abc.abstractmenthod1();
	abc.simplemethod1();
	}
}
