package javaDemo;

public class Arrays {

	public static void main(String[] args) {

		// Data Types:- 1. Primitive DataTypes and NonPrimitive DataType

		// num = 9600234
		// float, short, boolean, bit, byte

		short num = 1;
		System.out.println(num);
		int num1 = (10);
		System.out.println(num1);

		long num2 = 11111111111111111l;

		System.out.println(num1 + num2);

		double num3 = 10.10;
		System.out.println(num3);
		float num4 = 10.10f;

		System.out.println(num4);

		boolean num5 = false;
		System.out.println(num5);
		char ch = 'p';
		System.out.println(ch);
		int x = 10;
		System.out.println(x);
		char y = 'a';

		System.out.println(y);
		String z = "Hasan";
		System.out.println(z);

		// NonPrimitive Datatype (String, Arrays, Classes and Interfaces)

		String txt = "Atiq"; // data type
		System.out.println(txt);

		// syntax for Arrays:
		// String [] names = {"yousuf", "shihab", "Mamun"};
		// String [] names = {"Atiq","Meem","Naz"};
		String[] list = { "book", "book2", "book3" };

		System.out.println(list);
		// 1. How to store the values into Arrays(Note: Two ways available)

		// way-1- examples
		// int [] prices = {10,12,13,15,20,25};
		// String [] emp = {"Harun","Reza", "Daizy", "Touhid","Shipan","Sumaiya"};

		// Examples-1 (integer type)
		int[] id = { 10, 20, 30, 40, 50, 60 }; // array.length

		// Get count of arrays -array.length
		System.out.println(id.length);
		System.out.println("................................");
		// Get particular value from arrays
		System.out.println(id[3]);
		System.out.println(id[1]);
		System.out.println(id[5]);

		System.out.println("...................................");

		// Example-2 (String type)
		String[] names = { "milton", "shakil", "abcd", "lipee" };

		System.out.println(names.length);
		System.out.println(names[2]);

		// others examples
		// int[] ph = {123, 456, 789, 1 ,2 ,3 ,4};
		// char[] ch1 = {'a', 'b', 'c', 'd'};

		// print ant particular value
		// System.out.println(names[2]);

		// how to get count of Array ---> array.lenght
		// System.out.println(names.length);
		// System.out.println(ph.length);*/

		// way-2 (using object)
		// ClassName obj = new ClassName();

		// String[] names = new String[4];
		String[] emp = new String[5];
		// String [] emp1 = new String [6];
		emp[0] = "Reza";
		emp[1] = "Daisy";
		emp[2] = "Tushar";
		emp[3] = "Shakil";
		emp[4] = "Sumit";
		emp[5] = "Atik";

		/*
		 * String [] obj = new String[5]; obj[0]= "rumel"; obj[1] = "rumi"; obj[2] =
		 * "neepa"; obj[3] = "xyz"; obj[4] = "abc";
		 */
		// obj[5] = "mamun";

		// obj[5] = "Reza";
		// System.out.println(5);

		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,");

		// 2. How to pick particular value from Array ---> array[indexNumber]
		System.out.println(emp[4]);

		// 3. how to get count of Array ---> array.lenght
		System.out.println(emp.length);

		System.out.println("********************");

	}

}
