import java.util.Scanner;
class Main{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int[] marks = new int[5];
		int i;

		for(i=0;i<marks.length;i++)
			marks[i] = sc.nextInt();

		for(i=0;i<marks.length;i++)
				System.out.println(marks[i]);
	}
}