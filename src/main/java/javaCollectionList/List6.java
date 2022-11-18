package javaCollectionList;

import java.util.ArrayList;
import java.util.List;

public class List6 {

	public static void main(String[] args) {

		//Java is an object-oriented programming language(OOP)
		List<Integer>lst = new ArrayList<Integer>();
		
		lst.add(100);
		lst.add(200);
		lst.add(300);
		lst.add(400);
		
		
		System.out.println(lst);
		
		System.out.println(lst.size());
		
		System.out.println(lst.add(500));
		
		System.out.println(lst);
		
		for(Integer eachList: lst) {
			System.out.println(eachList);
		}
		
		System.out.println(lst.size());
		
		System.out.println(lst.contains(200));
		
		System.out.println(lst.isEmpty());
		lst.remove(2);
		
		System.out.println(lst.size());
		
		lst.clear();
		
		System.out.println(lst.isEmpty());
		
	

	}

}
