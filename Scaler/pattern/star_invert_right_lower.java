// star_invert_right_lower
/*
    *
   **
  ***
 ****
*****
*/
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),i,j;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>i;j--)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}