package reviewclass2;

public class Denebbbbb {

	public static void main(String[] args) {
		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 }

		};
int sum=0;
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < a[i].length; j++) {
				//System.out.print(a[i][j]);
				
				if((i%2==0)||(j%2==0)) sum=sum+a[i][j];

				//System.out.println(sum);
				
				
				
				/*
				 * a[i][j] a[0][1] a[0][2] a[0][3]
				 * 
				 * a[1][0] a[1][1] a[1][2] a[1][3]
				 * 
				 * a[2][0] a[2][1] a[2][2] a[2][3]
				 * 
				 */
			}
			//System.out.println(sum);
		}
		System.out.println(sum);
	}

}

/*Write a program that sums all numbers that are on even index and on even row and prints it out.

For example, in the following array, the numbers with parentheses would be summed:

     0  1  2  3

0   (4)(6)(3)(2)
1   (4) 1 (2) 3
2   (1)(2)(6)(9)
*/