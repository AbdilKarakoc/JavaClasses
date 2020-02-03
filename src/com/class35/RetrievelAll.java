package com.class35;


import java.util.*;
import java.util.Map.Entry;


public class RetrievelAll {

	public static void main(String[] args) {
		Map<String,Integer>  classRoom = new HashMap<>();
		classRoom.put("Instructor", 3);
		classRoom.put("Student", 80);
		classRoom.put("Tables", 20);
		classRoom.put("Chairs", 80);
		System.out.println(classRoom);
		Set<Entry<String, Integer>> entrySet=classRoom.entrySet();
		for(Entry<String,Integer> entry:entrySet) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println("*******************Iterator.................");
		
		Iterator<Entry<String, Integer>> entryIterator=entrySet.iterator();
		while(entryIterator.hasNext()) {
		Entry<String, Integer> ent=entryIterator.next();
		String entry=ent.getKey()+":...."+ent.getValue();
		System.out.println(entry);
		
		}
	}

}
