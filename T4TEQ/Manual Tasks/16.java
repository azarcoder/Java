import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(),c=0;
	    int[] a = new int[100];
	    for(int i=0;i<n;i++)
	        a[i]=sc.nextInt();
	    int v = sc.nextInt();
	    for(int i=0;i<n;i++)
	        for(int j=i+1;j<n;j++)
	            if(a[i]+a[j]==v)
	                c++;
	   System.out.print(c);
	        
	}
}