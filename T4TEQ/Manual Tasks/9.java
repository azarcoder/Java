import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),c=5,x=5;
		for(int i = 1 ; i <= n ;i++)
		{
		    for(int j = i ; j <= n ; j++)
		    {
		        if(i==j)
		        {
		            System.out.print(i+" ");
		            x=n;
		        }
		        else{
		            x+=i;
		            System.out.print(x+" "); 
		            x+=n-j;
		        }
		    }
		    System.out.println();
		}
	}
}
