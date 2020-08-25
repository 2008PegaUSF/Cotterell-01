import othrpack.floatVars;
public class otherpackN100 {
	
		
	static void pkAccess() {
		floatVars.var1 = 5;
		floatVars.var2 = 5;
				
	}
	
	
	
	
	static int[] oneh = new int[100];
	
	static void list100 () {
		for(int i=0; i<100 ; i++) {
			otherpackN100.oneh[i] = i+1;
		}
		
		
		
		for(int h=0; h<99 ; h++) {
			
			if(otherpackN100.oneh[h]%2 != 0) {
				System.out.println(h);
			}
		}
		
		
	}
	
	
	

}
