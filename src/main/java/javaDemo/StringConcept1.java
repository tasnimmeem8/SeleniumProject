package javaDemo;

public class StringConcept1 {

	public static void main(String[] args) {
		
		String txt1 = "World";
		String txt2 = "World";
		String txt3 = "WORLD";
		String txt4 = "  World  ";
		int num = 303;
		
		System.out.println(System.identityHashCode(txt1));
		System.out.println(System.identityHashCode(txt2));
		System.out.println(System.identityHashCode(txt3));
		
		System.out.println(txt1==txt3);
		System.out.println(txt1==txt2);
		
		System.out.println(txt1.length());
		System.out.println(txt1.contains("or"));
		System.out.println(txt4.trim());
		
		System.out.println(txt4.trim().concat(txt3)+" ".concat(txt4+" ".concat(txt3+" Hi ".concat(txt1+" "+num))));
		
	}
	
	

}
