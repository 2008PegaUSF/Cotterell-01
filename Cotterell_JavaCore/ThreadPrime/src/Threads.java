import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Threads extends Thread {
	
	
	
	public void start( ) {
		
		System.out.println("start");
		
		Deque deque1 = new ArrayDeque();
		Deque controller = new ArrayDeque();
		
	}
	
	
	
	
	
	public boolean Checkprime(int a) {
				
		boolean a2 = false;
		
		
			
		for (int i = 2; i < a; i++) {
			
			if ( a%i == 0) {
				a2 = false;
			}
					
								
				
			}
			
	
		
		
		if (a2 == true) {
			
			System.out.println("is not prime");
		}
		if (a2 == false) {
			
			System.out.println("is prime");
		}
		
		return a2;
	}
	
}
	
	
	
	


