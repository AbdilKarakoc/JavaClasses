package com.class37;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Repl211 {
public static void main(String[] args) {
	List<Map<String,Object>> dataList=new ArrayList<>();
	
	Map<String, Object> appleMap=new TreeMap<>();
	appleMap.put("Items", "Apple");
	appleMap.put("Price", 20.00);
	appleMap.put("Quantity", 10);
	
	dataList.add(appleMap);
	
	
}
}
