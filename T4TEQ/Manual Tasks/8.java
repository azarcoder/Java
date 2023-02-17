import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b=0,s=0;
		int n = sc.nextInt();
		b=n%10;
		s=n%10;
		n/=10;
		while(n!=0)
		{
			if(n%10>b)
				b=n%10;
			if(n%10<s)
				s=n%10;
			n/=10;
		}
		System.out.print(b-s);
	}
}
