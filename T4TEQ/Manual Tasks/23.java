//apple is the only fruit that has a name as apple and colour as apple
import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    String s = sc.nextLine(),f=sc.next(),r=sc.next();
	    StringBuilder sb = new StringBuilder(s);
	    String[] c = s.split(" ");
	    int x=0;
	    for(int i=0;i<c.length;i++)
	    {
	       if(c[i].equals(f))
	       {
	           x++;
	           if(x%2==0){
	               
	               System.out.print(r+" ");
	           }
	           else 
	             System.out.print(c[i]+" ");
	       }
	       else
	           System.out.print(c[i]+" ");
	    }
	}
}