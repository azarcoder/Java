class Main
{
	public static void main(String args[])
	{
		//Explicit type cast
		long i=100000000;
		int a=(int)i;
		System.out.println(a);

		//Widenning type cast
		int d=1000;
		long l=d;
		System.out.println(l);

		//This is not correct converstion
		int p=1000;
		byte s= (byte)p;//This is lossy compression so be careful of this
		System.out.println(s);
	}
}