package beans;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class BankingWork {
	
	
	readVerifiedFile();
	readNonVerifiedFile();
	
	public void readNonVerifiedFile1(){
		try {
			ArrayList<Bankuser> list;
			FileInputStream is = new FileInputStream(new File ("needVerified.txt"));
			ObjectInputStream os = new ObjectInputStream(is);
			list = (ArrayList<Bankuser>) os.readObject();
			
			
			//We are saving the list into the accList that is made globally at the top of the program
			nonVerifiedAccList = list;

			os.close();
			is.close();
		}
		catch (IOException i) {
		   i.printStackTrace();
		} catch (ClassNotFoundException c) {
		       System.out.println("Bankuser not found");
		       c.printStackTrace();
		}
		
	}
	
	public void readVerifiedFile1(){
		try {
			ArrayList<Bankuser> list;
			FileInputStream is = new FileInputStream(new File ("Verified.txt"));
			ObjectInputStream os = new ObjectInputStream(is);
			list = (ArrayList<Bankuser>) os.readObject();
			
			
			//We are saving the list into the accList that is made globally at the top of the program
			verifiedAccList = list;

			os.close();
			is.close();
		}
		catch (IOException i) {
		   i.printStackTrace();
		} catch (ClassNotFoundException c) {
		       System.out.println("Bankuser not found");
		       c.printStackTrace();
		}
		
	}
	
	
	
	

}
