import java.util.*;
class Prime{
    Prime(int a){
        int r=0;
        while(a!=0)
        {
            r=r*10+a%10;
            a/=10;
        }
        int copy=r;
        while(r!=0)
        {
            if(r%10==2 || r%10==3 || r%10==5 || r%10==7)
            {
                break;
            }
            r/=10;
        }
        while(copy!=0)
        {
            if(copy%10!=r%10)
                System.out.print(copy%10);
            copy/=10;
        }
        
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Prime  p =new Prime(sc.nextInt());
	}
}
