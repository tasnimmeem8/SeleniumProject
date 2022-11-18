package javaCollectionList;

import java.util.ArrayList;
import java.util.List;

public class List4 {

	public static void main(String[] args) {
	
		//Java is an object-oriented programming language(OOP)
		List<String>lst = new  ArrayList<String>();
		
	         lst.add("meem");
	         lst.add("ohona");
	         lst.add("Arup");
	          	
	         for (String eachlst : lst) {
	        	 System.out.println(eachlst);
	         }
	         
	         System.out.println(lst);
	         
	         lst.add("Arun");
	         
	         System.out.println(lst);
	         
	         System.out.println(lst.size());
	         
	         System.out.println(lst.get(1));
	         System.out.println(lst.get(0));
	         
	         lst.clear();
	         lst.isEmpty();
	         
	         lst.add("Meem");
	         
	        System.out.println( lst.isEmpty());
	   
	         
	         
	         
	         
	         
	         
		

	}

}
