package reviewclass2;

public class Nestedif {

	
	public static void main(String [] args) {
		
	boolean hasMoney= true;
	boolean isRestNear=false;
	
	if (hasMoney==true) {
		if(isRestNear) {
			// nested formulu bu sekilde
			System.out.println("I will eat in the resturant");
			
		}else { 
			System.out.println("Cant walk long distance");
			
		}
	}
	
	
	}
}
