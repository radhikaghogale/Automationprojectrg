package collectionframework;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String args[])
	
	{
		List<String> ar  = new ArrayList<String>();
		ar.add("Radhika");
		ar.add("Raviraj");
		ar.add("Rishaan");
		ar.add("Riya");
		ar.add("Riya");
		ar.add(null);
		ar.add(null);
		//ar.add(10);
		ar.add("............");
		//first way iterator
		/*
		Iterator<String> it = ar.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
	
		// Second way for each loop
	
		/*
		for (String ab:ar)
			
		{
			System.out.println(ab);
		}
		*/
		
		//third way for loop
		System.out.println("Traversing way through loop");
		for (int i = 0; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		
	}
}
