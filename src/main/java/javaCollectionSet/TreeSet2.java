package javaCollectionSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {

		Set<String> obj = new TreeSet<String>();

		obj.add("Chair");
		obj.add("Table");
		obj.add("Spoon");
		obj.add("Glass");

		System.out.println(obj);
		System.out.println(obj.size());
		obj.remove("Chair");
		obj.add("Fork");
		System.out.println(obj.contains("Table"));

		for (String eachobject : obj) {
			System.out.println(eachobject);
		}
		obj.clear();
		obj.isEmpty();
		System.out.println(obj.isEmpty());

	}

}
