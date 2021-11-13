package HashMapDemos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		Map<String, Integer> numberMapping = new HashMap<>();
		
		//adding key pair value
		numberMapping.put("one", 1);
		numberMapping.put("two", 2);
		numberMapping.put("three", 3);
		
		//does it accept duplicate key? it replaces the entry
		numberMapping.put("one", 11);
		
		System.out.println(numberMapping);
		
		//duplicate value ? YEP
		numberMapping.put("four",11);
		System.out.println(numberMapping);
		
		//add null? YEP
		numberMapping.put(null, null);
		
		System.out.println(numberMapping);
		
		//check if empty
		System.out.println(numberMapping.isEmpty());
		
		System.out.println(numberMapping.size());
		
		//contain key
		System.out.println(numberMapping.containsKey(null));
		
		//contain value
		System.out.println(numberMapping.containsValue(11));
		
		//get value
		System.out.println(numberMapping.get(null));
		
		//get key
		System.out.println(numberMapping.keySet());
		
		System.out.println(numberMapping.values());
		
		Set<Map.Entry<String,Integer>> iterator = numberMapping.entrySet();
		Iterator iterator2 = iterator.iterator();
		while (iterator2.hasNext()){
		System.out.println(iterator2.next());
		}
		
		//looping using labda
		numberMapping.forEach((k,v)-> System.out.println(k+ "_" +v));
	}

}
