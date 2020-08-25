import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class tester {
	
	static Integer[] b = {1,0,5,6,3,2,3,7,9,8,4,8,27,0};
	
	
	static Integer[] bfinal = new Integer[b.length]; 
	
	Integer[] cfinale = {0,0,1,2,3,3,4,5,6,7,8,8,9,27};
	
	
	static Integer[] brun() {	
	for(Integer dd : BubbleNfibonacci.bub(b)) {
		int i = 0;
		bfinal[i] = dd;
		System.out.print(dd+ " ");
		i++;
	}
	return bfinal;
	}
	
	
	
	@Test
	public void test() {
		Assertions.assertArrayEquals(cfinale ,tester.brun());
	}
		
		
//	@Test
//	public void test2(){
//		
//	}
		
		
	}


