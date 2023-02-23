import java.util.*;
class Main{
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(110);
		a.add(120);
		a.add(130);
		a.add(140);
		a.add(150);
		a.add(160);
		a.add(170);
		a.add(180);
		a.clear();

		ArrayList<Integer> x = new ArrayList(
			Arrays.asList(12,34,56,48,50)
			);
		a.addAll(x);
		// System.out.print(a);

		//loop
		ListIterator <Integer> i = a.listIterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		//add , remove , addAll , removeAll
		//clear , contains , get , indexOf
		//isEmpty , lastIndoxOf , set , toArray
		//subList , trimToSize , size , get


	}
}