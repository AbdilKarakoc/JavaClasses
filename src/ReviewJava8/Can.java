package ReviewJava8;

import java.util.*;
import java.util.Map.Entry;


class Can {
	public static void main(String[] args){
		  
		 Map<String,String> map =new HashMap<>();
		 map.put("ONE","AAA");
		 map.put("TWO","BBB");
		 map.put("THREE","CCC");
		 map.put("FOUR","DDD");
		 map.put("FIVE","EEE");
		 
		 
		 System.out.println("HashMap Before Remove :");
		 Set<Entry<String,String>>keys=map.entrySet();
		 for(Entry<String, String> abd :map.entrySet()) {
			 System.out.println(abd);
			 
		 }
		 System.out.println("------------------");
	        map.remove("ONE", "AAA");
	        map.remove("FOUR", "DDD");
	         
	        System.out.println("HashMap After Remove :");
	         
	        for (Entry<String, String> entry :keys) 
	        {
	            System.out.println(entry.getKey()+" : "+entry.getValue());
	        }
	    }   
	}