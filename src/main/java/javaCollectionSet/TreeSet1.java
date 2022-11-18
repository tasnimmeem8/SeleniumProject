package javaCollectionSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		
		Set<Integer>num= new TreeSet<Integer>();
		
		num.add(10);
		num.add(20);
		num.add(60);
		num.add(0);
		num.add(30);
		
		System.out.println(num);
	
		System.out.println(num.size());
		
		num.add (33);
		num.remove(10);
		System.out.println(num.contains(30));
	
		for(Integer eachnumber:num) {
			System.out.println(eachnumber);
		}
		num.clear();
		System.out.println(num.isEmpty());

	}

}
