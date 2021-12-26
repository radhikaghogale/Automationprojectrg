package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class HasMapExample {

	public static void main (String args[])
	
	{
		Map map  =new HashMap ();
		//Adding elements to Map
		map.put(1 , "Amit");
		map.put(2, "Raghav");
		map.put(4, "Radhika");
		map.put(6, "Surabhi");
		
		System.out.println(map.get(1));
		
		//Traversing map
		Set set=map.entrySet();//Converting to Set so that we can traverse
		Iterator itr = set.iterator();
		
		while (itr.hasNext())
		{
			//Converting to Map.Entry so that we can get key and value separated
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());}
	}
}
