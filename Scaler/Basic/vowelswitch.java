import java.util.Scanner;//scanner class
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		char s = sc.next().charAt(0);

		switch(s)
		{
			case 'a','e','i','o','u','A','E','I','O','U'->{ //when we use -> this we can't use break
			 System.out.println("vowel");
			}
			default -> System.out.println("constant");
		}

	}
}