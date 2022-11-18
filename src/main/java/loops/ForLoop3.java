package loops;

public class ForLoop3 {

	public static void main(String[] args) {
		 
		/*for(dataType initialization ; condition ; increment){
			Statement(s);
		}*/

		for (int i = 1; i < 21 ; i = i+1) {
			System.out.println(i);
		}
		System.out.println(".............................");
		
		for (int j = 2 ; j <= 20 ; j = j+2) {
			System.out.println(j);
		}
	
		System.out.println("..............................");
		
		for (int k = 1 ; k < 20 ; k = k +2) {
			System.out.println(k);
		}
	
		String [] obj = new String [6];
		obj [0]= "Cow";
		obj [1]="Sheep";
		obj [2]= "Deer";
		obj [3]="cat";
		obj [4]= "Rat";
		obj [5]= "Bat";
		  
		for (int i=0; i<obj.length;i=i+1) {
			System.out.println(obj[i]);
		}
	System.out.println("............................");	
		for (int i=1 ; i<obj.length; i=i+2) {
			System.out.println(obj[i]);
		}
	System.out.println("...........................");
		for (int i = 0; i<obj.length; i=i+2) {
			System.out.println(obj[i]);
		}
	
	
	
	
	
	}

}
