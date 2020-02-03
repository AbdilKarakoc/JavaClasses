package reviewclass2;

public class Dog {
	
	String dogName;
	double dogWeight;
	static String dogBreed = "Mutt";
	
	Dog(String name, String breed, double weight){
	  dogName=name;
		dogWeight=weight;
		dogBreed=breed;
	}
	Dog(String name,double weight){
    dogName=name;
		dogWeight=weight;
	
	}
	
	void display(){
	  	System.out.println(dogName+" " +dogBreed+" " +dogWeight);
	}
	public static void main(String[] args) {
	    
	    Dog dog1 = new Dog("Tarzan", "Mutt", 50);
	    Dog dog2 = new Dog("Tarzan", 50);
	    dog1.display();
	    dog2.display();
	    
	    
	  }
	}
