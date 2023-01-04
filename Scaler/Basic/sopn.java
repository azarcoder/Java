//sum of positive number
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),sum=0;
		for(int i=1;i<=a;i++)
		{
			int s = sc.nextInt();
			if(s>0)
				sum+=s;
		}
		System.out.print("Sum of given number is:"+sum);
	}
}