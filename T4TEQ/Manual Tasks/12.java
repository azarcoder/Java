import java.util.Scanner;
class binary{
	int dec_to_bin(int n)
	{
		int s=0,x=1,r;
		while(n!=0){
			r=n%2;
			s+=r*x;
			x*=10;
			n/=2;
		}
		return s;
	}
	int power(int b,int p)
	{
		int i,s=1;
		for(i=0;i<p;i++)
			s*=b;
	return s;
	}

}
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),c=0,x,a=0,i;
		binary b = new binary();
		x=b.dec_to_bin(n);
		while(x!=0)
		{
			if(x%10==1)
				c++;
			x/=10;
		}
		for(i=0;i<c;i++)
		{
			a+=b.power(2,i);
		}
		System.out.print(a);
		
	}
}