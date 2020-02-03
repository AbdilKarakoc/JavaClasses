package com.class30;

 class A extends Mark {
 
	int math;
	int science;
	int history;
	
	A(int math,int science,int history){
		this.math=math;
		this.science=science;
		this.history=history;
	}
	
	void getPercentage() {
	int average=(math+science+history)/3;
	System.out.println(average);
 }
 }

