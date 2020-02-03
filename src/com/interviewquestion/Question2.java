package com.interviewquestion;

import java.util.Arrays;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr ={ 100, -90, 8787, 898, 0, 1};
		   
		Arrays.sort(arr);
		int min=arr[0];
		int max=arr[arr.length-1];
		System.out.println(min);
		System.out.println(max);
		
		 System.out.println("************************");
		
		//second way
		int[] myArray ={ 100, -90, 8787, 898, 0, 1};
		
			int largest = myArray[0];
		    int smallest=myArray[0];
		    
		    
		    for (int i = 1; i < myArray.length; i++)  {
		      if(myArray[i]>max) {
		        largest=myArray[i];
		      
		      }
		      if(myArray[i]<smallest) {
		        smallest=myArray[i];
		      }
		    }
		    System.out.println(smallest);
		    System.out.println(largest);
		    
		   // System.out.println(secondLargest);
		    
		    System.out.println("************************");
		    
		   
		    int[] nums ={ 100, -90, 8787, 898, 0, 1};
		    int large=nums[0];
		    int secondLarge=nums[0];
		    
		    for(int i=0;i<nums.length; i++) {
		   if(nums[i]>large) {
		    	secondLarge=large;
				large=nums[i];
		    	
		    }
		    if(nums[i]>secondLarge && nums[i]<large) {
		    	secondLarge=nums[i];
		    	System.out.println(secondLarge);
		    }
		    
		    
		    
		    } 
		    
	}
}
