package collectionframework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		hm.put(100, "Amol");
		hm.put(105, "Radhika");
		hm.put(102, "mrunali");
		hm.put(109, null);
		hm.put(110, "100");
		System.out.println("Initial list of elements");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey() + " "+ m.getValue());
		
	}

	}
}
