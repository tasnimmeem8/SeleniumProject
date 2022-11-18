package javaDemo;

public class Animal {
	
	   public static void main(String[] args) {
		   //OOP (Object Oriented Programming)java
		   Animal obj = new Animal();		
			
		   obj.cow();
		   obj.cow();
		   obj.cow();
		   
		   obj.rat();
		   obj.rat();
		   obj.rat();
		   obj.rat();
		   
			obj.fish();
			obj.fish();
			
			
			obj.dog();
			obj.dog();
			obj.dog();
			
			
			obj.add(6,7);
		
			
		   
	   }
	
	
	
	
	
	
	
	
	public void cow() {
		
		System.out.println("color");
		}
	
	
	private void rat() {
		System.out.println("eat");
	}
    void fish() {
	 System.out.println("swim");
 }

   protected void dog () {
	   System.out.println("mouth");
   }
 
   public int add(int a, int b) {
		 
		System.out.println(a+b);
		return a+b;}
   
   


	
}
   
   

	
	
