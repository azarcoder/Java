//Hierarchical
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

class C extends A
{
    void displayc(){
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