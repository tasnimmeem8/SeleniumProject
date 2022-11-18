package loops;

public class ForLoop2 {

	public static void main(String[] args) {
	  
		
	/*	for (dataType initialization ; condition ; increment) {
			Statement(s)
		}*/
		
		
		for (int i=1; i<=50 ; i = i+1) {
			System.out.println(i);
		}
		System.out.println("......................................");

	    for (int j = 2; j<=30; j = j+2) {
	    	System.out.println(j);
	    }
	
	    System.out.println(".......................................");
	    
	    for (int k= 1; k<40; k = k+2) {
	    	System.out.println(k);
	    }
	
	
	    String [] obj = new String [6];
	    
	    obj [0]= "Meem";
	    obj [1]= "Ohona";
	    obj [2]= "Atique";
	    obj [3]="Rosy";
	    obj [4]="Mamun";
	    obj [5]="Shafin";
	    
	    for (int i = 0; i< obj.length ; i = i+1) {
	    	System.out.println(obj[i]);
	    }
	System.out.println("...............................");
	    for (int i=1 ; i < obj.length ; i = i+2) {
	    	System.out.println(obj[i]);
	    }
	System.out.println (".............................");
	    for (int i=0 ; i < obj.length; i = i+2) {
	    	System.out.println(obj[i]);
	    }
	System.out.println("..............................");
	    for (int i=0 ; i <= 5; i= i+1) {
	    	System.out.println(obj[i]);
	    }
	
	
	
	}

}
