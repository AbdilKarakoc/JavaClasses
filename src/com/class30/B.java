package com.class30;

 class B extends Mark {
	 	int math;
		int science;
		int history;
		int music;
		
	 B(int math,int science,int history,int music){
			this.math=math;
			this.science=science;
			this.history=history;
			this.music=music;
		}
		
		void getPercentage() {
		int average=(math+science+history+music)/4;
		System.out.println(average);
	 }
	 }

