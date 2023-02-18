import java.util.*;
// import java.util.Arrays;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[100];
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i++)
		    a[i] = sc.nextInt();
		
		for(int i =0 ; i < n ; i++)
		    for(int j = i+1 ; j< n ; j++)
		        if(a[i] > a[j])
		            a[i] = a[i]+a[j]-(a[j]=a[i]);
		for(int i =0 ; i < n ; i++)
		    System.out.print(a[i]+" ");
		    
		//Arrays.sort() method
		// Arrays.sort(a);
		// for(int i : a)
		//     System.out.print(i+" ");
		
		
	}
}
