package mypack;
public class Sum
{
	public void add(String x , String y){
		try{
			int a = Integer.parseInt(x);
			int b = Integer.parseInt(y);
			System.out.println(a+b);
		}
		catch(Exception ex){
			System.out.println(x+y);
		}
	}
}
