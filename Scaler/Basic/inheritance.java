//inheritance
/*
inherit all properties in base class

old class know as - base class , super or parent
new class called - sub , derived or child class 

types:
1.single
2.multilevel 
3.Hierarchical 
4.Hybridn(not possible in JAVA)
5.multiple inheritance (not possible in JAVA)
*/
//single
class A
{
    void displaya(){
        System.out.print("displayed by A");
    }
}

class B extends A
{
    void displayb(){
        System.out.print("displayed by B");
    }
}
public class Main
{
	public static void main(String[] args) {
		B b = new B();
		b.displaya();
		b.displayb();
	}
}

