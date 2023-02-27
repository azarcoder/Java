//access specifiers
/*
public(default)
protected (friends only)
private(only me)
default(public within  the program)
volatile

public --> methods
private --> attributes
*/
public class Main
{
	public static void main(String[] args) {
	    Test t = new Test();
	    t.print();
	    t.a=30;//can't access because a is private
	    t.print();
	    
	}
}
class Test{
    private int a;
    Test()
    {
        a=10;
    }
    void print()
    {
        System.out.println(a);
    }
}
