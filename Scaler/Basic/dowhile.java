import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),i=1;
		do
		{
			System.out.print(i+" ");
			i++;
		}while(i<=a);
	}
}