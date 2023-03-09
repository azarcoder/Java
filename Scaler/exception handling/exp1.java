import java.util.*;
import java.io.*;
class exp{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// System.out.println(a/b);//exception

		//syntax
		/*
		try{
			doubtfull statements
		}
		*/
		
		try{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
