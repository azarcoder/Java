import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(reader.readLine());
		System.out.printf("%d",n1*n2);
		in.close(); 
	}
}