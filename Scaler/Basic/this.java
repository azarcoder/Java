class A{
	String name;
	A(){
		name = "Azarudeen";
	}
	void printa()
	{
		System.out.print(name);
	}
}
class B extends A{
	void printb()
	{
		System.out.print(this.name);
	}
}
class Main extends B{
	public static void main(String []ar)
	{
	A a = new A();
	B b = new B();
	b.printb();
}
}