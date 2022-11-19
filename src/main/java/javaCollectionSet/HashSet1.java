package javaCollectionSet;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {

		// Java is an object-oriented programming language(OOP)
		Set<Integer> num = new HashSet<Integer>();

		num.add(100);
		num.add(200);
		num.add(300);
		num.add(400);

		System.out.println(num);

		System.out.println(num.size());

		System.out.println(num.contains(100));

		System.out.println(num.add(500));

		for (Integer eachnumber : num) {
			System.out.println(eachnumber);
		}
		num.remove(200);

		System.out.println(num.size());

		System.out.println(num.isEmpty());

		num.clear();

		System.out.println(num.isEmpty());

	}

}
