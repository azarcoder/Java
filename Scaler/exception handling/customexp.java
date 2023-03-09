import java.util.Scanner;
class dd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try{

			int weight=sc.nextInt();
			if(weight<50)
				throw new Exception("weight Invalid");
			else {
				System.out.println("Weight:"+weight);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
//throw keyword is mainly used to throw custom exceptions