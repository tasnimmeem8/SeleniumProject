package loops;

public class ForEachLoop2 {

	public static void main(String[] args) {

		/*
		 * for (DataType eachCollectio:Collection) { System.out.println(eachCollection);
		 * }
		 */

		String[] Subject = new String[8];

		Subject[0] = "English";
		Subject[1] = "Math";
		Subject[2] = "Music";
		Subject[3] = "Arts";
		Subject[4] = "Painting";
		Subject[5] = "History";
		Subject[6] = "Physics";
		Subject[7] = "Geography";

		for (String eachSubject : Subject) {
			System.out.println(eachSubject);
		}

	}

}
