package com.class19;

public class Task {

public static void main(String[] args) {
	Task isim=new Task();
	String email= isim.createEmail("john","snow","gmail.com");
	isim.createEmail2("john","snow","gmail.com");
	isim.buyuksayi(10, 20);
	int buyuksayi = isim.buyuksayi(10,20);
	System.out.println( buyuksayi*5);
}


String createEmail(String Name, String LastName, String email) {
	String createEmail=Name+LastName+"@"+email;
	return email;
	
}

void createEmail2(String Name, String LastName, String email) {
	String createEmail=Name+LastName+"@"+email;

}

	int buyuksayi(int a, int b) {
		if(a>b) {
			return a;
		
		}else {
			return b;
		}
		
	}
	
	
	
}
	
	
