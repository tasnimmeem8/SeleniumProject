package loops;

public class WhileLoop5 {

	public static void main(String[] args) {

		int[] num = new int[5];

		num[0] = 10;
		num[1] = 100;
		num[2] = 1000;
		num[3] = 10000;
		num[4] = 100000;

		int i = 0;

		while (i < num.length) {
			System.out.println(num[i]);
			i++;
		}

	}

}
