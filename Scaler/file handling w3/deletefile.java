import java.io.*;
class Main
{
	public static void main(String[] args) throws Exception {
		try{
			File f = new File("create.txt");
			if(f.delete())
			{
				System.out.println("file deleted successfully!");
			}
			else{
				System.out.println("file not found!");
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}