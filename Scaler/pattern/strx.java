import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int l = s.length();
		for(int i = 0 ; i < l ; i++)
		{
			for(int j = 0 ; j < l ; j++)
			{
				if (i==j || i+j==l-1)
						System.out.print(s.charAt(i));
				else 
					System.out.print(" ");
			}
			System.out.println();

		}
	}
}