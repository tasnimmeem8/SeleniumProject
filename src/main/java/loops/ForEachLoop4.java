package loops;

public class ForEachLoop4 {

	public static void main(String[] args) {
		
		
		String [] Name = new String [5];
		
		Name [0]= "Baby";
		Name [1]= "Robi";
		Name [2]= "Rita";
		Name [3]= "Gita";
		Name [4]="Mita";
		
		for (String eachName : Name ) {
			System.out.println(eachName);
		}

	}

}
