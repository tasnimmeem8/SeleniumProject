package loops;

public class WhileLoop1 {

	public static void main(String[] args) {
	
		
	/*  initialization; 
		while (condition) {
		Statement(s) ;
		increment; 
		}*/
       // used when number of iteration is not fixed . 
 
		int i = 1;
		while (i<=10) {
			System.out.println(i);
			i= i +1 ;
		}

	  String []obj	= new String [7];
	  obj [0]="English";
	  obj [1]="Math";
	  obj [2]="Geometry";
	  obj [3]="Physics";
	  obj [4]="Music";
	  obj [5]="Arts";
	  obj [6]="Games";
	  
	  int j = 0;
			 while(j<obj.length){
				  System.out.println(obj[j]);
				  j=j+1;
			  }

	
	
	
	
	
	
	
	

		
	}

}
