package paragraph11;

public class FindResult 
{
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		for(String s : "+U+n+c---".split(" "))
		{
			if(s.equals("+"))
				continue;
			else if(s.equals("-"))
				System.out.println(stack.pop() + " ");
			else
				stack.push(s);;
			
		}
		
	}

}
