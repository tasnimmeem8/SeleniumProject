package loops;

public class WhileLoop3 {

	public static void main(String[] args) {
	
   /*initialization ;
		 while (condition) {
			Statement;
			increment;
		}*/
		//Used when iteration is not fixed;
		
		String []sub=new String [8];
		
		sub [0]= "Math";
		sub [1]="History";
		sub [2]="English";
		sub [3]="Arts";
		sub [4]="Music";
	    sub [5]="Science";
		sub [6]="Painting";
		sub [7]="physics";
		
		
		int i=0;
		while (i<sub.length) {
			System.out.println(sub[i]);
			i=i+1;
		}
	
		
		
		
		
		
		
		
	}

}
