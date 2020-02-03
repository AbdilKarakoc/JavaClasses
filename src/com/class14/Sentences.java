package com.class14;

public class Sentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /*
         * .split()
         * this  method splits this string around matches of the given regular expression.
         */
        String str = "Video provides a powerful way to help you prove your point";
        
        String [] array =str.split(" ");
        
        for (int i=0; i<array.length;i++) {
            System.out.println(array[i]);
            System.out.println("**********************");
        }
        
        //How can we find how many sentences are in the following String.
        String str1 = "Today is sunday. It is sunny day. and we are having java class.";
        
        String [] array2=str1.split("\\.");
        System.out.println(array2.length);
        
        for (String string :array2) {
            System.out.println(string.trim());
            
        }
        
        
    }
}


