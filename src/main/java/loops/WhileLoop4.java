package loops;

public class WhileLoop4 {

	public static void main(String[] args) {

		int[] num = new int[5];

		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;

		int i = 0;
		while (i < num.length) {
			System.out.println(num[i]);
			i++;
		}

	}

}
