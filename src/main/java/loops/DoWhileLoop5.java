package loops;

public class DoWhileLoop5 {

	public static void main(String[] args) {
		
		String [] obj = new String [10];
		
		obj [0]="If";
		obj[1]="you";
		obj [2]="happy";
		obj[3]="and";
		obj [4]="you";
		obj [5]="know";
		obj [6]="it";
		obj [7] = "clap";
		obj [8]="your";
		obj [9]="hands";
		
		int i=0;
		do {System.out.println(obj[i]);
		i++;
		}while(i<10);
	}

}
