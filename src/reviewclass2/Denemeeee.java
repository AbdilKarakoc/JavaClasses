package reviewclass2;

import java.util.Scanner;

public class Denemeeee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner a=new Scanner(System.in);
		System.out.println("Please enter 5 numbers");
		int [] name=new int [5];
		
		for(int i=0; i<5; i++) {
		 name[i]=a.nextInt();
		//System.out.println(name[i]);
		}
		for(int i=4; i>=0; i--) {
		System.out.println(name[i]);
	}
}

}



/*For you to do:
Note: Create Scanner class

Write an array with size of 5. 
Use a loop to input values to the array (don't print any prompt message for Scanner).
Then print out all the elements you have created in the first loop in reverse order. 
*/