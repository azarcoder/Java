//Random game
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int n = (int) (Math.random() * 10 +1);
			if(n==5)
					break;
			System.out.print(n+" ");
		}
	}
}