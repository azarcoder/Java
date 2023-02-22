import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		power(sc.nextInt(),sc.nextInt());
	}
	static void power(int a, int b)
	{
	    int s=1;
	    for(int i =1 ; i <= b ; i++)
	        s*=a;
	   System.out.print(s);
	}
}
