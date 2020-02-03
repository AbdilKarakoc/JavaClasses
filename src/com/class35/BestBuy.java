package com.class35;

import java.util.*;

public class BestBuy {

	public static void main(String[] args) {
		
		Map<Integer,String> buys=new HashMap<>();
		buys.put(1234, "Shoes");
		buys.put(12345, "Bags");
		buys.put(12346, "Books");
		buys.put(12347, "Phones");
		buys.put(12348, "Jacket");
		buys.put(12349, "Computer");
		buys.put(12344, "Mouse");
		
		System.out.println("******************SIZE******************");
		System.out.println(buys.size());
		buys.clear();
		System.out.println(buys);
		
		System.out.println("******************ENTRY******************");
		System.out.println(buys);
		
		System.out.println("******************FOR LOOP KEY******************");
		
		Set<Integer> buy=buys.keySet();
		for(Integer name:buy) {
			System.out.println(name);
	}
		System.out.println("******************ITERATOR KEY******************");
		
		Iterator<Integer> names=buy.iterator();
		while(names.hasNext()) {
			System.out.println(names.next());
			
		}
		System.out.println("******************FOR LOOP VALUE******************");
		Collection<String> values=buys.values();
		for(String value:values) {
			System.out.println(value);
		}
		System.out.println("******************ITERATOR VALUE******************");
		
		Iterator<String> nam=values.iterator();
		while(nam.hasNext()) {
			System.out.println(nam.next());
		}
		System.out.println("******************KEYS AND VALUES LOOP******************");
		
		for(Map.Entry<Integer, String> entry:buys.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
	
		}
		System.out.println("******************KEYS AND VALUES ITERATOR******************");
		
		Iterator<Map.Entry<Integer, String>> entry1=buys.entrySet().iterator();
		while(entry1.hasNext()) {
			System.out.println(entry1.next());
		}
}
}
