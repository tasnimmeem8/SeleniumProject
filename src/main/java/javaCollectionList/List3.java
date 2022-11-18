package javaCollectionList;

import java.util.ArrayList;
import java.util.List;

public class List3 {

	public static void main(String[] args) {
		
		//Java is an object-oriented programming language(OOP)
		List<String>name = new ArrayList<String>();
		
		name.add("Meem");
		name.add("Ohona");
		name.add("Arun");
		name.add("Arup");
		name.add("abc");
		
		System.out.println(name);
	
		
		for (String eachname:name) {
			System.out.println(eachname);
		}
		

	}

}
