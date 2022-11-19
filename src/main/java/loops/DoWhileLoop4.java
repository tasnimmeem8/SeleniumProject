package loops;

public class DoWhileLoop4 {

	public static void main(String[] args) {

		String[] obj = new String[5];

		obj[0] = "Meem";
		obj[1] = "is";
		obj[2] = "a";
		obj[3] = "book";
		obj[4] = "lover";

		int i = 0;
		do {
			System.out.println(obj[i]);
			i = i + 1;
		} while (i < obj.length);

	}

}
