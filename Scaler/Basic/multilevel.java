//multilevel
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

class C extends B
{
    void displayc(){
        System.out.print("displayed by B");
    }
}
public class Main
{
	public static void main(String[] args) {
		C b = new C();
		b.displaya();
		b.displayb();
		b.displayc();
	}
}