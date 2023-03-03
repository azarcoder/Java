import java.util.*;
class Std{
    String name;
    int m1,m2,m3;
    Std(String name,int m1,int m2,int m3)
    {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    void disp()
    {
        System.out.printf("name:%s\tTotal:%d",name,(m1+m2+m3));
    }
}
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Std s[] = new Std[100];
	for(int i=0;i<3;i++)
	{
	    String nm = sc.next();
	    int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt();
	    s[i] = new Std(nm,m1,m2,m3);
	}
	for(int i=0;i<3;i++)
	{
	    if(s[i].m1>=35 && s[i].m2>=35 && s[i].m3>=35)
	        System.out.println(s[i].name);
	}
}
}
