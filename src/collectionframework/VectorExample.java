package collectionframework;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<String> vec = new Vector<String>();
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Elephant");
		vec.add("Dog");
		//adding elements using addElement() method of Vector
		
		vec.addElement("Rat");
		vec.addElement("Cat");
		vec.addElement("Deer");
		
		System.out.println("Elements are" + vec);
	}
}
