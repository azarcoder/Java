import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double i,p=0.1;
		for(i=1;i*i*i<=n;i++);
		for(i--;i*i*i<n;i+=p);
		if(i==(int)i)
			System.out.println("Cube");
		else
			System.out.println("Not");	
	}
}