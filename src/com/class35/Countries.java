package com.class35;

import java.util.*;

public class Countries {

	public static void main(String[] args) {
		Map<String, String> name=new TreeMap<>();

		name.put("Turkey", "Ankara");
		
		name.put("Cambodia", "Phnom Penh");
		
		name.put("Vietnam", "Hanoi");
		
		name.put("Laos", "Vientiane");
		
		System.out.println("*********forloop***************");
		Set<String> keys=name.keySet();
		for(String key:keys) {
			System.out.println(key);
		}
		
		System.out.println("*********Iterator***************");
		Iterator<String> nameIterator=keys.iterator();
			while(nameIterator.hasNext()) {
				System.out.println(nameIterator.next());
	}
			
			System.out.println("*********forloop***************");
			
			Collection<String> value= name.values();
			for(String val:value) {
				System.out.println(val);
			}
			System.out.println("*********Iterator***************");
				Iterator<String> valueIterator=value.iterator();
				while(value.iterator().hasNext()) {
					System.out.println(valueIterator.next());
				}
				
			
			
	}
}



