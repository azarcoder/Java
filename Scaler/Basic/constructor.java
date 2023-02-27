/*
constructor
- javap 
- by defult fill 0 for all objects
- one class ca have more than one constructor(polymorphism)
- no destructor -> garbage collector
- it's can't be called . it invoked during object creation
- constructor has same name of the class
- can't return anything
- just for initialization(print work but it is not it's job)

*/
class Test{
    int a;
    Test(){
        a=90;
    }
    void me()
    {
        System.out.print("hi azar!"+a);
    }
}
public class Main
{
	public static void main(String[] args) {
		Test t = new Test();
		t.me();
	}
}
