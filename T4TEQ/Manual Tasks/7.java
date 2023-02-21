import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1 ; i <= n ; i++)
		{
		    if(i <= n/2 && i%10 != 3 && i/10 != 3)
		        System.out.print(i+" ");
		    else if(i >= n/2 && i%10 != 3 && i/10 != 3 && i!=n)
		        System.out.print(i+",");
		    else if(i==n && i%10 != 3 && i/10 !=3)
		        System.out.print(i+".");
		    else if (i==n) 
		        System.out.print("\b.");
		}
	}
}
