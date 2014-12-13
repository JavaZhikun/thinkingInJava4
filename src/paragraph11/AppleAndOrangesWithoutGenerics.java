package paragraph11;

import java.util.ArrayList;

public class AppleAndOrangesWithoutGenerics 
{
//	public static void main(String[] args) {
//		@SuppressWarnings("unchecked")
//		ArrayList apples =  new ArrayList();
//		for(int i =0; i < 3 ; i++)
//		
//			apples.add(new Apple());
//			
//			apples.add(new Orange());
//			
//			for(int i = 0; i< apples.size(); i++)
//				System.out.println(((Apple)apples.get(i)).id());
//		
			
	
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i = 0; i < 3; i++)
			apples.add(new Apple());
//	        apples.add(new Orange());
		
		for(int i = 0; i <apples.size(); i++)
			System.out.println(apples.get(i).id());
		for(Apple c : apples)
			System.out.println(c.id());
		
		
	}
	

}

class Apple
{
	private static long counter;
	private final long id = counter++;
	public long id()
	{
		return id;
	}
}

class Orange
{
	
}
