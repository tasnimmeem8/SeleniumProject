package javaCollectionList;

import java.util.ArrayList;
import java.util.List;

public class List5 {

	public static void main(String[] args) {

		// Java is an object-oriented programming language(OOP)
		List<String> lst = new ArrayList<String>();

		lst.add("meem");
		lst.add("Ohona");
		lst.add("Mau");
		lst.add("Hulo");

		for (String eachList : lst) {
			System.out.println(eachList);
		}

		System.out.println(lst);

		System.out.println(lst.get(1));

		System.out.println(lst.size());

		System.out.println(lst.contains("meem"));

		System.out.println(lst.isEmpty());

		lst.clear();

		System.out.println(lst.isEmpty());

	}

}
