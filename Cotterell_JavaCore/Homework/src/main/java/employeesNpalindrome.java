import java.util.ArrayList;
import java.util.Comparator;

public class employeesNpalindrome implements Comparator  {
	
	
	//name, department, and age
	
	static String n;
	static String dep;
	static String age;
	
	static employeesNpalindrome e1 = new employeesNpalindrome();
	static employeesNpalindrome e2 = new employeesNpalindrome();
	static ArrayList<employeesNpalindrome> ar = new ArrayList<employeesNpalindrome>();
	
	static void Make(){
		
	}
	
	
	
	
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	static void comparison(){
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void palindrome() {
		ArrayList<String> array = new ArrayList<String>(); // All string
		ArrayList<String> palindromearray = new ArrayList<String>(); // Palindrome strings
		// Store the values “karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did” in array
		
		array.add("karan");
		array.add("madam");
		array.add("tom");
		array.add("civic");
		array.add("radar");
		array.add("jimmy");
		array.add("kayak");
		array.add("john");
		array.add("refer");
		array.add("billy");
		array.add("did");
		
		for (int i = 0; i < array.size(); i++) {
			if (isPalindrome((String) array.get(i))) 
			{ 
				palindromearray.add((String)array.get(i)); // add on to array
			}
			}
			System.out.println("Palindrome array: " + palindromearray);
			
		}
	
	public static boolean isPalindrome(String str) {
		String reverse = "";
		// reverse the string
		for (int i = str.length() - 1; i >= 0; i--) {
		reverse = reverse + str.charAt(i);
		}
		// check string matches to give string
		return str.equals(reverse);
		}

	

}
