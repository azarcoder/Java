import java.io.*;
class Main{
	public static void main(String[] args) throws Exception{
		try{
			File f = new File("create.txt");
			if(f.createNewFile())
			{
				System.out.println("file created successfully!");
			}
			else 
			{
				System.out.println("file already exists!");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
