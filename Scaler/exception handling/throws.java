import java.util.*;
class exp{
	//throws is used within the method signature
	static void pp(int a,int b) throws ArithmeticException{
		
			if(b==0)
				throw new ArithmeticException("b is 0");
			else
				System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		pp(a,b);

		
	}
}