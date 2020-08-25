
public class substringNeven {
	
	public static String substring(String str, int idx){
        String substring ="";

        for(int i=0; i<idx; i++)
        {
            substring =substring +str.charAt(i);
        } 
        return substring;
    }
	
	
	//change up
		public static boolean even(int int1){
		            //divide by 2
		        double divide=int1/(double)2;

		        //find floor of the result
		        double resultfloor=java.lang.Math.floor(divide);

		
		        //check if they same
		        if(resultfloor==divide)
		            return true;
		        else
		            return false;
		}

}
