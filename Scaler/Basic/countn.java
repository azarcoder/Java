import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),c=0;
		for(;a!=0;a/=10,c++);
		System.out.print(c);
	}
}