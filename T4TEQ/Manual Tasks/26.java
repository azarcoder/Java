import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    String s = sc.next();
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String r = sb.toString();
		if(s.equals(r))
		    System.out.print("palindrome");
		else 
		    System.out.print("not");
	}
}
