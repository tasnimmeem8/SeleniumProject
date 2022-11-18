package javaCollectionMap;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections4.map.HashedMap;

public class HashMap1 {

	public static void main(String[] args) {
		
		Map<String, String>name = new HashedMap<String, String>();
		
		name.put("FirstName", "LastName");
		name.put("Shahla", "Meem");
		name.put("Ohona", "Sharar");
		name.put("Dawood", "Khan");
		name.put("Shah", "Khan");
		
		System.out.println(name);
		System.out.println(name.containsValue("Meem"));
		System.out.println(name.containsKey("Shahla"));
		System.out.println(name.size());
		name.remove("Shahla");
		System.out.println(name.size());
		name.clear();
		System.out.println(name.isEmpty());
		
		for (Entry < String,String> eachname:name .entrySet()) {
		System.out.println(eachname.getKey()+ " "+ eachname.getValue());
		}
		
		
		
		
		
		
		
		
		
	}

}
