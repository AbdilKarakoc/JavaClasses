
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=1;
		while(num<=7) {
			System.out.println("Hello");
			num++;
		}
		
		
		int num1=1;
		do {
			System.out.print("Bye");
			num1++;
			
		}while(num1<=7);
	
		//if while condition value is wrong you get nothing but do while atleast you get one
		
		
		int c=20;
				while(c<=50) {
					System.out.println(c);
					c=c+2;
				}
			
				int d=20;
				do{
					System.out.print(d);
					d=d+2;
					}while(d<=50);
				
				
				
				int even=22;
				do {
					if(even%2==0) {
						System.out.println(even);
					}
					even=even+2;
				}while(even<=50);
	}
}
