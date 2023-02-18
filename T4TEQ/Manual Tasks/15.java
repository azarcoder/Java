import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] a = new int[100];
	    for(int i=0;i<n;i++)
	        a[i]=sc.nextInt();
	    int p = sc.nextInt(),v = sc.nextInt(); 
	    p--;
	    for(int i=n-1;i>=p;i--)
	        a[i+1]=a[i];
	    a[p]=v;
	    n++;
	    for(int i =0 ;i < n ; i++)
	        System.out.print(a[i]+" ");
	}
}