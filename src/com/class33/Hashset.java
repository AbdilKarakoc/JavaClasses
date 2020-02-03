package com.class33;

import java.util.HashSet;
import java.util.Iterator;
class Main {

public static void main(String[] args){
  
  HashSet<String>abdil=new HashSet<>();
  
  abdil.add("first");
   abdil.add("second");
    abdil.add("third");
     abdil.add("fourth");
      abdil.add("fifth");
      
     Iterator<String> it=abdil.iterator();
		while(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
}
}
}