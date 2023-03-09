import java.util.*;
import java.io.*;
class Main{
	public static void main(String[] args) throws Exception{
		try{
			File f = new File("azar.txt");
			Scanner reader = new Scanner(f);
			while(reader.hasNextLine())
			{
				String d = reader.nextLine();
				System.out.println(d);
			}
			reader.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}