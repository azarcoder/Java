import java.util.*;
class Person{
    private String name;
    void setName(String n){
        name = n;
    }
    String getName()
    {
        return "Welcome, "+name;
    }
}
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person obj1 = new Person();
		obj1.setName(sc.next());
		System.out.print(obj1.getName());
		
	}
}
