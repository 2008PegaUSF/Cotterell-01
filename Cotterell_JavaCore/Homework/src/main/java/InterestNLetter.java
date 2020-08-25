import java.util.HashMap;
import java.lang.Character;

public class InterestNLetter extends ABletter {
	static HashMap<Character, Integer> c = new HashMap<Character, Integer>();
	static HashMap<Character, Character> cc = new HashMap<Character, Character>();
	static String fi;
	
	@Override
	void Upper(String aa) {
		
		
        char[] a = new char[aa.length()]; 
  
        // letters go into array 
        for (int i = 0; i < aa.length(); i++) { 
            a[i] = aa.charAt(i); 
        } 
		 
		
		InterestNLetter.c.put('A', 0);
		InterestNLetter.c.put('B', 0);
		InterestNLetter.c.put('C', 0);
		InterestNLetter.c.put('D', 0);
		InterestNLetter.c.put('E', 0);
		InterestNLetter.c.put('F', 0);
		InterestNLetter.c.put('G', 0);
		InterestNLetter.c.put('H', 0);
		InterestNLetter.c.put('I', 0);
		InterestNLetter.c.put('J', 0);
		InterestNLetter.c.put('L', 0);
		InterestNLetter.c.put('M', 0);
		InterestNLetter.c.put('N', 0);
		InterestNLetter.c.put('O', 0);
		InterestNLetter.c.put('P', 0);
		InterestNLetter.c.put('Q', 0);
		InterestNLetter.c.put('R', 0);
		InterestNLetter.c.put('S', 0);
		InterestNLetter.c.put('T', 0);
		InterestNLetter.c.put('U', 0);
		InterestNLetter.c.put('V', 0);
		InterestNLetter.c.put('W', 0);
		InterestNLetter.c.put('X', 0);
		InterestNLetter.c.put('Y', 0);
		InterestNLetter.c.put('Z', 0);

		for (char in : a ) {							
			if(InterestNLetter.c.containsKey(in)) {
				System.out.println("There is an upper case letter");
			}
		}
		
	}
	
	
	
	
	
	

	@Override
	void toUpper(String a) {
		char[] aa = new char[a.length()];
		a.getChars(0, a.length(), aa,0);
		
		InterestNLetter.cc.put('a','A');
		InterestNLetter.cc.put('b','B');
		InterestNLetter.cc.put('c','C');
		InterestNLetter.cc.put('d','D');
		InterestNLetter.cc.put('e','E');
		InterestNLetter.cc.put('f','F');
		InterestNLetter.cc.put('g','G');
		InterestNLetter.cc.put('h','H');
		InterestNLetter.cc.put('i','I');
		InterestNLetter.cc.put('j','J');
		InterestNLetter.cc.put('l','L');
		InterestNLetter.cc.put('m','M');
		InterestNLetter.cc.put('n','N');
		InterestNLetter.cc.put('o','O');
		InterestNLetter.cc.put('p','P');
		InterestNLetter.cc.put('q','Q');
		InterestNLetter.cc.put('r','R');
		InterestNLetter.cc.put('s','S');
		InterestNLetter.cc.put('t','T');
		InterestNLetter.cc.put('u','U');
		InterestNLetter.cc.put('v','V');
		InterestNLetter.cc.put('w','W');
		InterestNLetter.cc.put('x','X');
		InterestNLetter.cc.put('y','Y');
		InterestNLetter.cc.put('z','Z');
		
		
		for (int i =0; i <aa.length; i++) {
		char n = InterestNLetter.cc.get(aa[i]);
		aa[i]=n;
		
		}
		
		
	}

	@Override
	void toAdd(String a) {
		
		
	}

}
