import java.util.Scanner;//scanner class
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);//scanner object
		int p = sc.nextInt();
		int n = sc.nextInt();
		int r = sc.nextInt();
		int si = (p*n*r)/100;
		System.out.println("Simple intrest="+si);

	}
}