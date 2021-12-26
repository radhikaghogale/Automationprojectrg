package collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	
	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet();
		set.add("Two");
		set.add("One");
		set.add("Five");
		//set.add(null); null not allowed in a treeset
		set.add("One");
		
		Iterator<String> i = set.iterator();
		while (i.hasNext())
			
		{
			System.out.println(i.next());
		}
	}
		
	}

