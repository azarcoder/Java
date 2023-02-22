import java.util.*;
class Square{
    float s;
    Square(int n){
        float t=0;
        this.s=n;
        while(t!=s){
            t=this.s;
            this.s=(n/t+t)/2;
        }
        System.out.print(this.s==(int)this.s?"perfect square":"not");
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Square s = new Square(sc.nextInt());
		
	}
}
