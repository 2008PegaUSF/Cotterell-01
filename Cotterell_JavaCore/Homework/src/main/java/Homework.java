import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import othrpack.floatVars;

public class Homework {

//1 2
	public static void main(String[] args) {
		
		
		  Integer[] a = {1,0,5,6,3,2,3,7,9,8,4};
		  Integer[] afinal;
		  
		  
		
		
		
		afinal = new Integer[a.length]; 
		
		
		for(Integer cc : BubbleNfibonacci.bub(a)) {
			int i = 0;
			afinal[i] = cc;
			System.out.print(cc+ " ");
			i++;
		}
		
		System.out.println(" ");
		System.out.println("bubble sort");
		System.out.println(" ");
		
		
			
			 
			
			System.out.println(" ");
			System.out.println(" ");
		
			BubbleNfibonacci.Fibonacci();
			
			
//		    /         /            ///    /         /            ///    /         /            /
//3 4			
			
			
			
		
		
		reverseNfactorial.Reverse();
		
		
		System.out.println(reverseNfactorial.factorial(10));
		
		
		
		
		
		
//	    /         /            ///    /         /            ///    /         /            /
//5 6		
		
		
		
		

		System.out.println(substringNeven.substring("Heythisisthestring", 3));
		System.out.println("Is 11 even:" + substringNeven.even(11));
		
		
		
		
		
		
//	    /         /            ///    /         /            ///    /         /            /
//7 8		
		
		

		employeesNpalindrome.palindrome();
		
		
		
		
		
//	    /         /            ///    /         /            ///    /         /            /
//9 10
		
		
		
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(); // Create an ArrayList object
		
		for(int i=0; i<=100; i++) {
			numbers.add(i);
		}
		
		for(int x=0; x<=100; x++) {
			
			
			if(primeNminimum.isPrime(numbers.get(x)) == true)
			{
				if(numbers.get(x) != 1) {
				System.out.print(numbers.get(x) + " ");
				}
			}
		}
		System.out.println();
		System.out.println(primeNminimum.minimun(3,7));
		
		
//	    /         /            ///    /         /            ///    /         /            /
//11 12
		
		System.out.println(" ");
		System.out.println(" old value: var1: " + floatVars.var1);
		System.out.println(" old value: var2: " + floatVars.var2);
		otherpackN100.pkAccess();
		System.out.println(" new value: var1: " + floatVars.var1);
		System.out.println(" new value: var2: " + floatVars.var2);
		System.out.println(" ");
		
		
		otherpackN100.list100();
		
//	    /         /            ///    /         /            ///    /         /            /
//13 14		
		triangleNswitch.binaryTri();
		
		triangleNswitch.switchS1();
		
		
		
//	    /         /            ///    /         /            ///    /         /            /
//15 16	
		if(args.length>0) {
		
		operateNcommand.cmd();
		String word = args[0];  
	    int count = 0;    
	    //characters counted minus space    
	    for(int i = 0; i < word.length(); i++) {    
	        if(word.charAt(i) != ' ')    
	            count++;    
	    }
		}
	        
	   

		
		
		
//	    /         /            ///    /         /            ///    /         /            /
//17 18		
		
		Scanner scanner = new Scanner(System.in); // scanner declaration
		System.out.println("Enter principle:");
		float principle = scanner.nextFloat(); 
		System.out.println("Enter time in years: ");
		float years = scanner.nextFloat(); 
		System.out.println("Enter rate: ");
		float rate = scanner.nextFloat(); 
		float simpleinterest = (principle*rate*years); 
		System.out.println("Simple interest: " + simpleinterest); 

		String text = "apple";
		InterestNLetter let = new InterestNLetter();
		let.Upper(text);
		let.toUpper(text);
		

		
		
//	    /         /            ///    /         /            ///    /         /            /
//19 20
		
			
		
		
		
		
		
		
	}
	

}
