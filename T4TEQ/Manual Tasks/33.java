import java.util.*;
class Setdetails{
    String name;
    int mark1,mark2,mark3;
    void setData(String n,int m1,int m2,int m3)
    {
        this.name = n;
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;
    }
}
class Calculate extends Setdetails{
    void nm()
    {
        // float avg = (this.mark1+this.mark2+this.mark3)/3;
        System.out.printf("Total: %d\tAverage:%d",(this.mark1+this.mark2+this.mark3),(this.mark1+this.mark2+this.mark3)/3);
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculate obj = new Calculate();
		obj.setData(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		obj.nm();
	}
}
