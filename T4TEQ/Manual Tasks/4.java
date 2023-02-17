//celcius to fahrenheit
import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(),f=0;
		f=(c*9/5)+32;
		System.out.print(f);
	}
}