import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] ch = s.split(" ");
		for(int i=0;i<ch.length;i++)
		{
		    String str = new String(ch[i]);
		    if(str.length() >= 3)
		        str=str.replace(str.charAt(1),str.charAt(2));
		    System.out.print(str+" ");
		}
		    
	}
}
