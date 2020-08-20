import java.util.*;



public class Bubble {
	
	public static void main(String[] args) {
		
		
			
				
				Integer[] a = {1,0,5,6,3,2,3,7,9,8,4};
		
		List<Integer> list1 = Arrays.asList(a);		
		
		for (int i = 0; i < (list1.size()-1); i++ ){
			

			for(int ii = 0; ii != 10 ; ii++ ){
					
				int c = 0;

				
				if(list1.get(ii+1) < list1.get(ii)){
					
					c = list1.get(ii);		
					list1.set(ii, list1.get(ii+1));
					list1.set(ii+1, c);
						
				}
			}
		
		}
		
		for(Integer cc : list1) {
			System.out.print(cc);
		}
		

	}

}
