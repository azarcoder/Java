import java.util.*;
public class Main
{
    static int calc(int a)
    {
        return a*a;
    }
    static int calc(int a , int b)
    {
        return a*b;
    }
    static int calc(int a ,int b , int c)
    {
        return a>b && a>c ? a : b>c ? b : c; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.println(calc(a));
        System.out.println(calc(a,b));
        System.out.println(calc(a,b,c));
    }
}
