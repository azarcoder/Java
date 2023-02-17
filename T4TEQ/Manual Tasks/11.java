import java.util.Scanner;
class prime
{

	int pri(int n)
	{
		int f=1,i;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				f=0;
				break;
			}
		}
		return f;
	 }
	 int rev(int n)
	 {
	 	int r=0;
	 	while(n!=0)
	 	{
	 		r=r*10+n%10;
	 		n/=10;
	 	}
	 	return r;
	 }
}
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt(),r;
		prime p=new prime();
		r = p.rev(n);
		if (p.pri(n)==1 && p.pri(r)==1)
				System.out.print("Yes");
		else
			System.out.print("No");	
	}
}
