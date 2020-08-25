
public class reverseNfactorial {
	
	public static void Reverse() {
		String text = "See here is my string";
		for (int x = 0; x < text.length(); x++) {
		    text = text.substring(1, text.length() - x)
		        + text.substring(0, 1)
		        + text.substring(text.length() - x, text.length());
		 }
		 System.out.println(text);
	}
	
	
	
	public static int factorial(int start) {
		int count= start;
		int result = count-1;
		for(int i=0; i < start-1; i++)
		{
			count = count * result;
			result--;
		}
		return count;
			
	}
	
	
	

}
