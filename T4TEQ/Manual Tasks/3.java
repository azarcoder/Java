import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main{
	public static void main(String[] args) throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		int n1 = Integer.parseInt(reader.readLine());
		int n2 = Integer.parseInt(reader.readLine());
		int s1=1,s2=1,i;
		for (i=1;i<=n2;i++)
			s1*=n1;
		for (i=1;i<=n1;i++)
			s2*=n2;
		System.out.printf("%d",s1>s2?s1:s2);
		in.close();
	}
}