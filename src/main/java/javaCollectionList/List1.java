package javaCollectionList;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// Java is an object-oriented programming language(OOP)
		// 1. ArrayList, Step 1:- Create object for ArrayList class
		// Step 2: Use all List methods one by one
		// Syntax-List<Integer> lst = new ArrayList<Integer>();
		// List<Integer> id = new ArrayList<Integer>();
		List<Integer> id = new ArrayList<Integer>();

		id.add(10);
		id.add(20);
		id.add(30);
		id.add(40);
		id.add(50);
		id.add(60);
		id.add(10);
		id.add(50);

		System.out.println(id.size());
		id.add(70);
		// After adding new item in the list
		System.out.println(id);
		System.out.println(id.size());

		id.remove(4);
		System.out.println(id);

		System.out.println(id.contains(20));

		for (Integer eachId : id) {
			System.out.println(eachId);
		}

		id.clear();
		id.isEmpty();

		/*
		 * List<Integer> id = new ArrayList<Integer>(); id.add(20); id.add(15);
		 * id.add(10); id.add(20); id.add(30); id.add(444); id.add(17); id.add(444);
		 * id.add(5); System.out.println(id); //maintain inserting order-see output
		 * 
		 * System.out.println("...............................................");
		 * 
		 * System.out.println(id.size());
		 * 
		 * System.out.println("...............................................");
		 * 
		 * for (Integer eachId : id) { System.out.println(eachId); }
		 */

		// List<String> lst = new ArrayList<String>();

		// List<String> lst = new ArrayList<String>();

	}

}
