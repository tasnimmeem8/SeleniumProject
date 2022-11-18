package loops;

public class Forloop4 {

	public static void main(String[] args) {
		 /*for (dataType initialization ; condition ; increment ) {
			 Statement(s);
		 }*/
		// used when number of iteration is fixed
		
		for ( int i = 1 ; i <=10 ; i = i+1) {
			System.out.println(i);
		}
   
		System.out.println("............................");
		
		for (int j= 2 ; j < 11 ; j = j +2) {
			System.out.println(j);
		}
		System.out.println("...........................");
		
		for (int k= 1 ; k< 10 ; k = k + 2) {
			System.out.println(k);
		}


		String []obj=new String [8];
		obj [0]="cat";
		obj [1]="Rat";
		obj [2]="Chicken";
		obj [3]="Cow";
		obj [4]="Sheep";
		obj [5]= "Bat";
		obj [6]="Rat";
		obj [7]="Fish";
		
		//Printing everything on list
		for (int i=0 ; i< obj.length; i=i+1) {
			System.out.println(obj[i]);
		}
		System.out.println("....................");
		
		//Printing odd results only
        for (int i=1 ; i <obj.length; i= i+2) {	
        	System.out.println(obj[i]);
        }
        System.out.println("......................");
        
        //Printing even results only
        for (int i=0; i<obj.length ; i=i+2) {
        	System.out.println(obj[i]);
        }

        for (int i =0; i<5 ; i++) {
        	System.out.println("Fish");
        }
        
        
        
        
        
        
        
        
        


}

}
