import java.io.*;
class Main
{
	public static void main(String[] args) throws Exception {
		try
		{
			File f = new File("myfile.txt");
			System.out.println("file name:"+f.getName());
			System.out.println("file path"+f.getAbsolutePath());
			System.out.println("Readable:"+f.canRead());
			System.out.println("Writable:"+f.canWrite());
			System.out.println("Length:"+f.length());
			System.out.println("List:"+f.list());
			System.out.println("exist:"+f.exists());
		}
		catch(Exception e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}