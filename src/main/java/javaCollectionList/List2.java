package javaCollectionList;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
	
	//Syntax-List<Integer> lst = new ArrayList<Integer>();
	//	have to write full form of Integer for List
		//Java is an object-oriented programming language(OOP)

		List<Integer>id= new ArrayList<Integer>();
		
		id.add(10);
		id.add(20);
		id.add(30);
		id.add(40);
		id.add(50);
		
		System.out.println(id);
		
		System.out.println(id.contains(10));
		
		System.out.println(id.size());
	/*	for (DataType eachCollections : Collection){
			Statement (eachCollections);*/
		
		for (Integer eachid : id) {
			System.out.println(eachid);
			
			
		
		
		
		
		}

	}

}
