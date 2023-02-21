import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int l = s.length();
		for(int i = 0 ; i < l ; i++)
		{
			for(int j = l-1 ; j >= i ; j--)
					System.out.print(" ");
			for(int j = 0 ; j <= i ; j++)
			    System.out.print(s.charAt(j));
			System.out.print("  ");
			for(int j = i ; j >= 0 ; j--)
			    System.out.print(s.charAt(j));
			System.out.println();
		}
	}
}