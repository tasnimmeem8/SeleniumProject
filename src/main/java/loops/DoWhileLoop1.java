package loops;

public class DoWhileLoop1 {

	public static void main(String[] args) {
	/*	initialization;
		do{
		Statement(s);
		increment;
		} while(condition); */
		
		
		String []obj=new String [8];
		obj [0]="cat";
		obj [1]="Rat";
		obj [2]="Chicken";
		obj [3]="Cow";
		obj [4]="Sheep";
		obj [5]= "Bat";
		obj [6]="Rat";
		obj [7]="Fish";


		int i=0;
		do {
			System.out.println(obj[i]);
			i=i+1;
		} while (i<obj.length);
		
	

		
		
	}

}
