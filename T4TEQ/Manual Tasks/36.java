import java.util.*;
class Con{
    
    Con(int a)
    {
        System.out.println(a%10);
    }
    Con(int a , int b)
    {
        if(a>b)
             System.out.println(a-b);
        else 
             System.out.println(b-a);
    }
    Con(int a ,int b , int c)
    {
         System.out.println(a<b && a<c ? a : b<c ? b : c); 
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
	    Con x = new Con(a);
	    Con y = new Con(a,b);
	    Con z = new Con(a,b,c);
	}
}
