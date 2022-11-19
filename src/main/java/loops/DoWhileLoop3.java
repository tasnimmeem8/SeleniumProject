package loops;

public class DoWhileLoop3 {

	public static void main(String[] args) {

		/*
		 * increment ; do { Statement; interval; } while (condition);
		 */

		// used when iteration is not fixed and have to print at least once;

		String[] ani = new String[8];

		ani[0] = "Dog";
		ani[1] = "Cat";
		ani[2] = "Bat";
		ani[3] = "Rat";
		ani[4] = "Bird";
		ani[5] = "Deer";
		ani[6] = "Fox";
		ani[7] = "Cow";

		int i = 0;
		do {
			System.out.println(ani[i]);
			i = i + 1;
		} while (i < ani.length);

	}

}
