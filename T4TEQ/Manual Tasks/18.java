import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int n = sc.nextInt(),m=0,i,ind=0,j;
		Boolean f = false;
		for(i = 0 ; i < n ; i++)
		    a[i] = sc.nextInt();
		for(i=0;i<n;i++)
		    if(a[i]>m)
		    {
		        ind = i;
		        m=a[i];
		    }
		for(i =ind ; i < n ; i++)
		{
		    f=false;
		    for(j = i+1 ; j< n ; j++)
		        if(a[i] < a[j])
		            f=true;
		    if(f==false)
		        System.out.print(a[i]+" ");
		}
		            
		
	}
}