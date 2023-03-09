import java.io.*;
class Main{
	public static void main(String[] args) throws Exception{
		try{
			File f = new File("create.txt");
			if(f.exists())
			{
				FileWriter fw = new FileWriter(f);
				fw.write("content wrote by FileWriter!!!");
				fw.close();//should be close otherwise data won't write
				System.out.println("content wrote successfully!");
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