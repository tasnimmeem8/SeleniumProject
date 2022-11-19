package javaCollectionSet;

import java.util.HashSet;
import java.util.Set;

public class HashSet2 {

	public static void main(String[] args) {

		// Java is an object-oriented programming language(OOP)
		Set<String> ani = new HashSet<String>();

		ani.add("Bird");
		ani.add("Cow");
		ani.add("Dog");
		ani.add("Deer");

		System.out.println(ani);
		System.out.println(ani.size());
		System.out.println(ani.contains("Cow"));
		ani.add("Cat");
		for (String eachanimal : ani) {
			System.out.println(eachanimal);
		}

		ani.clear();
		System.out.println(ani.isEmpty());
	}

}
