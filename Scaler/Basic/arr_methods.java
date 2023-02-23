import java.util.*;
class Main{
	public static void main(String[] args)
	{
		int[] a = {1,5,2,34,89,90};
		//sort
		Arrays.sort(a);
		System.out.println("sorted:"+Arrays.toString(a));

		//binarySearch
		System.out.println("Element 2 found in:"+Arrays.binarySearch(a,2));

		//clone
		int b[] = a.clone();
		System.out.println("cloned array:"+Arrays.toString(b));

		//equals
		System.out.println("equals:"+Arrays.equals(a,b));

		//copyOf
		int c[] = Arrays.copyOf(a,5);
		System.out.println("copyOf:"+Arrays.toString(c));

		//copyOfRange
		int d[] = Arrays.copyOfRange(c,2,5);
		System.out.println("copyOfRange:"+Arrays.toString(d));

		//fill
		int[] x = {12,34,54,78,33};
		Arrays.fill(x,99);
		System.out.println("fill:"+Arrays.toString(x));

		//asList
		Integer arr[] = {1,2,3,4,5};
		List <Integer> l = Arrays.asList(arr);
		System.out.print("list:"+l); 

	}
}