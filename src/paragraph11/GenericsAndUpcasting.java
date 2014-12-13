package paragraph11;

import java.util.ArrayList;

public class GenericsAndUpcasting {

	public static void main(String[] args) 
	{
		ArrayList<Apple> apples = new ArrayList<Apple>();
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Breaburn());
		
		for(Apple c : apples)
		  
			System.out.println(c);
		
	}
}


class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Breaburn extends Apple{}

