package collectionframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

			public static void main(String[] args) {
		
			//Creating HashSet and Adding elements prints as per given order in a code
				
				LinkedHashSet<String> set =new LinkedHashSet();
				set.add("One");
				set.add("Two");
				set.add("Three");
				set.add("Four");
				set.add(null);
				set.add("Five");
				set.add(null);
				set.add("one");
				set.add("One");
				
				Iterator<String> i = set.iterator();
				while (i.hasNext())
					
				{
					System.out.println(i.next());
				}
			}
			
			
		}

