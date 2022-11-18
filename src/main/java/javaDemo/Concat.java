package javaDemo;

public class Concat {

	public static void main(String[] args) {

		String txt1 = "Hi";
		String txt2 = "my name";
		String txt3 = "is Meem";
		String txt4 = "I Love";
		String txt5 = "to";
		String txt6 = "travel";
		String txt7 = "My phone number starts with";
		int num=313;
		String txt8= "It's";
		String txt9="62";
		String txt10 = "today";
		String txt11= "little";
		String txt12="cold";
		
		
		
		System.out.println(txt1+" ,".concat(txt2+" ".concat(txt3+". ".concat(txt4+" ".concat(txt5+" ".concat(txt6+". ".concat(txt7+" "+num+".")))))));
		System.out.println(txt8+" ".concat(txt9+" ".concat(txt10+", ".concat(txt11+" ".concat(txt12+".")))));

		
	}

}
