import java.util.*;
class exp{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try{
			if(b==0)
				throw new ArithmeticException("b is 0");
			else
				System.out.println(a+b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}