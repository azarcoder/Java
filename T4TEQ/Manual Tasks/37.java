class Parent
{
    public void display()
    {
        System.out.println("Display 1");
    }
}
class Child extends Parent
{
    
    public void display()
    {
        super.display();
        System.out.println("Display 2");
    }
}
public class Main
{
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	}
}
