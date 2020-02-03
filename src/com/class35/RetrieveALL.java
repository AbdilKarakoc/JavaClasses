package com.class35;

import java.util.*;

public class RetrieveALL {

	public static void main(String[] args) {
		Map<String, String> personMap =new LinkedHashMap<>();
		
		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Yildiz");
		personMap.put("Address", "123 Test");
		personMap.put("City","Dallas");
		personMap.put("State", "TX");
		
		System.out.println(personMap);
		//how to retrieve a specific value
		String value=personMap.get("State");
		System.out.println(value);
		
		
		System.out.println("************Printing all keys************");
		//How to retrieve all keys
		
		Set<String> keys=personMap.keySet();
		for(String key:keys) {
			System.out.println(key);
		}
		System.out.println("****************Second way***********");
		
		Iterator<String> keysIterator=keys.iterator();
		while(keysIterator.hasNext()) {
			System.out.println(keysIterator.next());
		}
		
		System.out.println("**************Print all values************");
		Collection<String> values=personMap.values();
		for(String val:values) {
			System.out.println(val);
		}
		System.out.println("********second way*************");
		Iterator<String> valueIterator=values.iterator();
		while(valueIterator.hasNext()) {
			System.out.println(valueIterator.next());
			
		}
	
		
		System.out.println("**************all keys and values*************");
		Set<String> keys1=personMap.keySet();
		
		for(String key:keys1) {
			System.out.println(key+":"+personMap.get(key));
		}
		
		
		Iterator<String> keyIterator=keys.iterator();
		
		while(keysIterator.hasNext()) {
			//System.out.println(keysIterator.next()+ personMap.get(keysIterator.next()));
			String mapKey=keysIterator.next();
			String mapValue=personMap.get(mapKey);
			
			System.out.println(mapKey+"_"+mapValue);
		}
		
		
		
		}

}
