package javaCollectionList;

import java.util.ArrayList;
import java.util.List;

public class List8 {

	public static void main(String[] args) {
		
		List<Integer>number = new ArrayList<Integer>();
		
		number.add(100);
		number.add(200);
		number.add(300);
		number.add(400);
		number.add(500);
		
		for(Integer eachNumber:number) {
			System.out.println(eachNumber);
		}
		
		System.out.println(number.contains(100));
		System.out.println(number.equals(number));
		System.out.println(number.hashCode());
		
		

	}

}
