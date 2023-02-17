import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt(),n2=sc.nextInt(),i=1,s1=0,s2=0;
		while(i<=n1/2)
		{
			if(n1%i==0)
				s1+=i;
			i++;
		}
		i=1;
		while(i<=n2/2)
		{
			if(n2%i==0)
				s2+=i;
			i++;
		}
		if(s1==n2 && s2==n1)
			System.out.print("Yes");
		else
			System.out.print("No");

	}
}