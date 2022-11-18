package loops;

public class ForEachLoop1 {

	public static void main(String[] args) {
 
	/*	for (DataType eachCollections : Collection){
			Statement (eachCollections);
			}*/
		
		String [] Obj = new String [6];
		   
		    Obj [0]= "Meem";
		    Obj [1]= "Ohona";
		    Obj [2]= "Atique";
		    Obj [3]="Rosy";
		    Obj [4]="Mamun";
		    Obj [5]="Shafin";
  
		    
		    for (String eachObj : Obj ) {
		    	System.out.println(eachObj);
		    }

	}

}
