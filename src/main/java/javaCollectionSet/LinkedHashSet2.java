package javaCollectionSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet2 {

	public static void main(String[] args) {
		
		Set<String>name= new LinkedHashSet<String>();
		
		name.add("Meem");
		name.add("Shafin");
		name.add("Mamun");
		name.add("Atique");
		name.add("Nipa");
		name.add("Beli");
		
		System.out.println(name);
		System.out.println(name.contains("Beli"));
		System.out.println(name.size());
		name.add("Rosy");
		name.remove("Meem");
		for(String eachname:name) {
			System.out.println(eachname);
		}

		name.clear();
		System.out.println(name.isEmpty());
	}

}
