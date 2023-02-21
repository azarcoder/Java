import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    String s = sc.next();
	    boolean f = false;
	    if(s.charAt(0) == '0')
	        System.out.print("Not a Duck");
	    else
	    {
            for(int i=1 ; i<s.length() ; i++)
            {
               if(s.charAt(i)=='0')
               {
                    f=true;
                    break;
               }
            }
            if(f==true)
                System.out.print("Duck Number");
            else 
                System.out.print("Not a Duck");
            
	    }
	    
}
}
