class MyException extends Exception{
	MyException(String s)
	{
		super(s);
	}
}
class Main
{
	public static void main(String[] args) {
		try
		{
			throw new MyException("azar");
		}
		catch(MyException err)
		{
			System.out.println(err);
			System.out.println(err.getMessage());
		}
	}
}