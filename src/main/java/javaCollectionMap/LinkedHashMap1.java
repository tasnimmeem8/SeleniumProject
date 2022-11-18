package javaCollectionMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMap1 {

	public static void main(String[] args) {

		Map<String, Integer> Sub = new LinkedHashMap<String, Integer>();
		
		Sub.put("Math", 100);
		Sub.put("English", 90);
		Sub.put("History", 33);
		Sub.put("Biology",95);
		Sub.put("Physics", 98);
		
		System.out.println(Sub);
		System.out.println(Sub.size());
		System.out.println(Sub.containsKey("Math"));
		for (Entry <String, Integer> eachSubject : Sub .entrySet()) {
			System.out.println(eachSubject.getKey()+ "  " + eachSubject.getValue());
		}
		Sub.clear();
		System.out.println(Sub.isEmpty());

	}

}
