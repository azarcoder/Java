/*
    a
   b c
  d e f
 g h i j
k l m n o
*/
import java.util.*;
class Main{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	char a='a';
	for(int i=1; i<=n;i++)
	{
		for(int k=n;k>=i;k--)
			System.out.print(" ");
		for(int j=1;j<=i;j++)	
			System.out.print(a++ +" ");
		System.out.println();
	}
}
}