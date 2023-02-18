import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int[] a = new int[100];
    int n = sc.nextInt();
    for (int i = 0; i < n; i++)
        a[i] = sc.nextInt ();
    
    int r,j;
    char x[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    for (int i = 0;i < n ; i++)
    {
        j=a[i];
        String s="";
        while(j!=0)
        {
            r=j%16;
            s=x[r]+s;
            j/=16;
        }
        System.out.print(s+" ");
    }
    }
}
