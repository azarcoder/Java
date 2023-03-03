import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n,m=0;
		String s ="";
		n = sc.nextLong();
		while(n!=0)
		{
			m=n%26;
			s=(char)(m+64)+s;
			n/=26;
		}
		System.out.print(s);
	}
}