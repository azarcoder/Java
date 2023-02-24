import java.util.*;
class Main
{
    static boolean anagram(String s){
        StringBuilder sb = new StringBuilder(s); 
        boolean f = false;
        // long star=System.currentTimeMillis();
        sb.reverse();
        String rev = sb.toString();
        if(s.equals(rev))
            f=true;
        // System.out.println(System.currentTimeMillis()-star);
        return f;
        
        
    }
	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(),e="";
		boolean f=false;
		for(int i =0 ; i < s.length() ; i++)
		{
		    e="";
		    for(int j = 0 ; j < s.length() ; j++)
		        if(i != j)
		            e=e+s.charAt(j);
		    if(anagram(e)){
		        f=true;
		        break;
		    }
		}
		if(f) System.out.print("Yes");
		else System.out.print("No");
		       
	}
}
