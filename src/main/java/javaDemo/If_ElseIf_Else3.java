package javaDemo;

public class If_ElseIf_Else3 {

	public static void main(String[] args) {

		int A = 90;
		int B = 80;
		int C = 70;
		int D = 60;
		// int F =50;

		if (A <= 89) {
			System.out.println("GradeA");
		}

		else if (B <= 79) {
			System.out.println("GradeB");
		}

		else if (C <= 69) {
			System.out.println("GradeC");
		} else if (D >= 60) {
			System.out.println("GradeD");
		}

		else {
			System.out.println("Fail");
		}

	}

}
