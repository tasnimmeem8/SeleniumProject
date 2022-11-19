package loops;

public class DoWhileLoop2 {

	public static void main(String[] args) {

		/*
		 * initialization; do { Statement ; increment; }while (condition);
		 */

		// used when number of iteration is not fixed and have to print at least one

		String[] ani = new String[8];

		ani[0] = "Cow";
		ani[1] = "Bat";
		ani[2] = "Rat";
		ani[3] = "Bird";
		ani[4] = "Dog";
		ani[5] = "Chicken";
		ani[6] = "Fox";
		ani[7] = "Deer";

		int i = 0;
		do {
			System.out.println(ani[i]);
			i = i + 1;
		} while (i < ani.length);

	}

}
