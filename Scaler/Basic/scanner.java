import java.util.Scanner;//we have to import scanner when we use scanner class
class Main
{
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);

		//int
		//int a = sc.nextInt();
		//System.out.println(a);

		//byte
		//int b = sc.nextByte();

		//Long
		//int b = sc.nextLong();

		//short
		//int b = sc.nextShort();

		/*
		//String
		String str = sc.next(); //take only before space
		System.out.println(str);

		String str2 = sc.nextLine(); //take Input until next line
		System.out.println(str2);

		*/
		/*
		//boolean
		boolean bool = sc.nextBoolean();
		System.out.println(bool); //will give either true or false

		*/
		//for single character
		char a = sc.next().charAt(0);
		System.out.println(a);
	}	
}