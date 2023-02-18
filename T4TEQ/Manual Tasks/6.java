import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),c;
		float s=0;
		if(n<=50)
			System.out.print("Free");
		else if(n>50 && n<=150)
			s=(n-50)*3;
		else if(n>150 && n<=250)
			s=(100*3)+(n-150)*5;
		else if(n>250)
			s=(100*3)+(100*5)+(n-250)*7;
		if(s!=0){
		s+=s*20/100;//add 20%
		c=(int)s*2/2;
		if (c==s)
			System.out.print(c);
		else 
			System.out.print(s);	
		}
		}
}
