package loops;

public class ForLoop1 {

	public static void main(String[] args) {
		
		/*for (initialization; condition; increment) {
			statement(s)
			}*/
       
		for (int i =1; i<=20;i=i+1) {
			System.out.println(i);
			}
		
		
		System.out.println("..........................................");
		
		
		
		for (int j = 2; j <=100; j= j+2) {
			System.out.println(j);
		}
		
		
		System.out.println("...........................................");
		
		for (int k = 1; k<=49;k=k+2) {
			System.out.println(k);
		}
		
		
		String [] obj = new String [5] ;
		 
		obj [0]= "English";
		obj [1]= "Science";
		obj [2]= "History";
		obj [3]="Math";
		obj [4]= "Geography";
		
		for (int i=0; i < obj.length ; i = i+ 1 ) {
			System.out.println(obj[i]);
		}
		
		
	}}