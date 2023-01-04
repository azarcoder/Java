import java.util.Scanner;
class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int s=0;
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		System.out.print("Enter " +n+" numbers:");
		int a = sc.nextInt();
		for(int i=1;i<n;i++)
		{
			s = sc.nextInt();
			if(a<s)
				a=s;
		}
		System.out.print(a);
	}
}