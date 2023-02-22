import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] c = str.toCharArray();
		
		for(int i = 0 ; i < c.length ; i++)
		    for(int j = i+1 ; j < c.length ; j++)
		        if (c[i] < c[j])
		        {
		            char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
		        }
		        
        // Arrays.sort(c);
        String s = "";
		for(int i = 0 ; i < c.length ; i++)
		    s+=c[i];
		System.out.print(s);
	}
}
