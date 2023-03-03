import mypack.*;
import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next(),s2=sc.next();
		Sum s = new Sum();
		s.add(s1,s2);
	}
}