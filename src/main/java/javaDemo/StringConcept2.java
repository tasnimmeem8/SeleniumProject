package javaDemo;

public class StringConcept2 {

	public static void main(String[] args) {

		String text = "TEXT";
		String text1 = "TEXT";
		String text2 = "TEXT";

		// Finding Memory location
		System.identityHashCode(text);
		System.identityHashCode(text1);
		System.identityHashCode(text2);
		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));
		System.out.println(System.identityHashCode(text2));

		// compare the value of two different variable
		text.equals(text);
		text.equals(text1);
		text.equals(text2);
		System.out.println(text.equals(text1));
		System.out.println(text1.equals(text2));
		System.out.println(text.equals(text2));

		System.out.println("........");

		// Comparing Memory Address
		System.out.println(text == text1);
		System.out.println(text1 == text2);
		System.out.println(text == text2);

		// length
		System.out.println(text.length());

		// Concat (only for String String)
		System.out.println(text.concat(text2.concat(text1)));
		System.out.println(".........");

		// Trim
		String text3 = "     HELLO WORLD     ";
		System.out.println(text3);
		System.out.println(text3.trim());

		// Concat
		System.out.println(text.concat(text2.concat(text3.concat(text1))));

		// Contains
		System.out.println(text.contains("llo"));
		System.out.println(text3.contains("llo"));
		System.out.println(text3.contains("LLO"));

		// Uppercase
		System.out.println(text.toUpperCase());

		// LowerCase
		System.out.println(text3.toLowerCase());

		System.out.println(text3.trim().toLowerCase());

	}

}
