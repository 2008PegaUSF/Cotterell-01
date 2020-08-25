
public class primeNminimum {
	
	public static boolean isPrime(int num) { 
		
		
		if (num == 2 || num == 3) { 
			return true; 
			} 
		if (num % 2 == 0 || num % 3 == 0) { 
			return false; 
			} 
		for (int i = 3; i < Math.sqrt(num); i += 2) 
		{ 
			if (num % i == 0 || num % Math.sqrt(num) == 0) 
			{ 
				return false; 
			} 
		} 
		return true; 
		}

	
	
	public static int minimun(int x, int y){
		if(x<y)
		{
			return x;
		}
		
		if(x>y)
		{
			return y;
		}
		
		if(x==y)
		{
			System.out.println("There is no minuim value");
		}
		return 0;
	}
	

}
