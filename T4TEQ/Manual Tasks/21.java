import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    String s = sc.next();
	    char c;
        for(int i=0 ; i<s.length() ; i++)
        {
            c = s.charAt(i);
            System.out.print(s.lastIndexOf(c)+" ");
        }
	}
}
