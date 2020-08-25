import java.util.Arrays;
import java.util.List;



public class BubbleNfibonacci {
	
	public static List<Integer> bub(Integer[] a) {				
		
		List<Integer> list1 = Arrays.asList(a);		
		
		for (int i = 0; i < (list1.size()-1); i++ ){
			

			for(int ii = 0; ii != list1.size()-1 ; ii++ ){
					
				int c = 0;

				
				if(list1.get(ii+1) < list1.get(ii)){
					
					c = list1.get(ii);		
					list1.set(ii, list1.get(ii+1));
					list1.set(ii+1, c);
						
				}
				
			}
			
		}
		
		return list1;
		
		
		}
	
	
	
	
	
	
	
	
	
	public static void Fibonacci() {
		 int x=1;
	  int temp =0;
	  int fib=1;
	  boolean check = true;
	    for(int i=0; i<=25; i++)
	    {
	       if(x == 1 && check == true)
	      {
	        fib = 2;
	         check = false;
	      } 
	      else
	      {
	      temp = x;
	      x=fib;
	      fib = temp + x;

	      }
	      System.out.println("fibonnaci " + i + ": "  + fib);
	    }
	}
		

	}

