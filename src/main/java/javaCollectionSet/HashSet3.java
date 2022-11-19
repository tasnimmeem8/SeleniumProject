package javaCollectionSet;

import java.util.HashSet;
import java.util.Set;

public class HashSet3 {

	public static void main(String[] args) {

		Set<String> name = new HashSet<String>();
		// Set<String>name= new LinkedHashSet<String>();
		// Set<String>name= new TreeSet<String>();

		name.add("Meem");
		name.add("Ohona");
		name.add("Miu");

		for (String eachnm : name) {
			System.out.println(eachnm);
		}

	}

}
