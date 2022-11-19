package loops;

public class ForEachLoop5 {

	public static void main(String[] args) {

		Integer[] num = new Integer[5];

		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;

		for (Integer eachnum : num) {
			System.out.println(eachnum);
		}

	}

}
