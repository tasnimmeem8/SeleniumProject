package loops;

public class DoWhileLoop6 {

	public static void main(String[] args) {

		int[] num = new int[5];

		num[0] = 1;
		num[1] = 10;
		num[2] = 100;
		num[3] = 1000;
		num[4] = 10000;

		int i = 0;
		do {
			System.out.println(num[i]);
			i++;
		} while (i < num.length);

	}

}
