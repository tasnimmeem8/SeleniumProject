package javaCollectionList;

import java.util.ArrayList;
import java.util.List;

public class List7 {

	public static void main(String[] args) {

		//Java is an object-oriented programming language(OOP)
		List<Integer>number = new ArrayList<Integer>();
		
		number.add(10);
		number.add(200);
		number .add(30);
		number.add(40);
		number.add(60);
		
		for(Integer eachnum:number) {
			System.out.println(eachnum);
		}

		System.out.println(number);
		System.out.println(number.contains(60));
		number.clear();
		System.out.println(number.isEmpty());
	}

}
