

public class Fnums {
	
	
	int[] number(int a) {
		
		int b[] = new int[25];
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		Integer ai;
		
//		System.out.println(b.length);
		for(int aa = 0; aa <= 24; aa=aa) {
			//System.out.println(aa);
			//System.out.println(b[24]);
			
			if((d == 0 & c == 0) && (aa <= 24)) {
				
				d = a;
				
				b[aa]= c;
				aa=aa+1;
			
			}
						
			if(aa <= 24) {
				
				e = c+d;
				b[aa] = e;
				
				aa=aa+1;
				
			}
						
			
			if(aa <= 24) {
				d = c + e;
				b[aa] = d;
				aa=aa+1;
			}
			
			
			if(aa <= 24) {
				c = e+d;
				b[aa] = c;
				aa=aa+1;
			}
			
			
			
			
		}
		
		for (int x : b) {
			System.out.print(x + " ");
//			if (x == b[f] ) {
//				
//			}
				
		}
		
		return b;
	}
	
	
	
	public static void main(String[] args) {
		Fnums o = new Fnums();
		o.number(1);
		
	}

}
