package com.class14;

public class TwoSentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // how to separate comma delimated string.
        
        String str = "If you come to class ealry, then you can study more, and you can leave early";
        
        String [] array = str.split(",");
        
        for (int i=0; i<array.length;i++) {
            System.out.println(array[i]);
        }
        
        System.out.println("****************************");
        String str1="Welcome To Syntax Technologies";
        String[] array2=str1.split(" ",3);
        System.out.println(array2.length);
        for(int i=0; i<array2.length; i++) {
        	System.out.println(array2[i]);
        	
        }
    }
}

