import java.util.*;
import java.io.*;
class exp{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		//multiple exceptions
		try{
			try{
				System.out.println(a/b);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}