import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class bankApp {
	
	  Scanner input = new Scanner(System.in);
	  newAccount tool;
	  newAccount usr;
	  HashMap temp;
	  String tempstr;
//	  List<newAccount> employeeList = new ArrayList<newAccount>();
	  HashMap <String, Integer> userCreds = new HashMap();
	  HashMap <Integer, newAccount> userinfo = new HashMap();
	  HashMap <String, String> usernamesAndPasswords = new HashMap();
	  
	 bankApp() {
		run();
	}
		
	public void run() {
		usr = new newAccount();
		
		//method call for the login screen
		loginScreen();
	}
	
	
		
	
	
	
	
	public  void loginScreen() {
		System.out.println("Welcome to the banking app!");
		System.out.println("Select an option below by entering the coresponding number...");
		System.out.println("1. Create an account");
		System.out.println("2. Create a joint account");
		System.out.println("3. Log in");
		System.out.println("4. Exit");
		String option = input.nextLine();
		
		
		
		

		if(option.equals("1")) {
			addNewUser();
		}

		else if(option.equals("2")) {
			createJointAct();
		}

		else if(option.equals("3")) {
			Login();
		}
		else if(option.equals("4")) {
			exit();
		}
		else {
			System.out.println("Invalid entry");
			System.out.println(" ");
			loginScreen();
		}
		
		
	}
	
	
	//Everything above just starts the program
   //////////////////////////////////////////////////////////////////
	
	
	
	
	
		public void IDcheck(newAccount check, int aa) {
						
			while(userCreds.containsValue(aa) != false ) {
				check.createID();
			}
		}
		
		
		
		
		
		
		
		
			
	
	public  void addNewUser() {    //option 1
		getUsernames();
		newAccount usrA = new newAccount();
		
		
		usrA.newAccount(); //creates name, usrnm, pswrd, 0 balance, and ID
		
		
		IDcheck(usrA, usrA.getID());
		System.out.println(" ");
		System.out.println("Your ID is" + usrA.getID());
		
		
		
		if (usernamesAndPasswords.containsValue(usrA.getusername()) != false) {//check if ID exists
			System.out.println(" ");			
			usrA.diffName(usrA, usernamesAndPasswords ,usernamesAndPasswords.containsValue(usrA.getusername()) == true);
			System.out.println(" ");
			
		
		}
		userCreds.put(usrA.getusername()+usrA.getpassword(), usrA.getID());//adds concatenated string of usrnm and pswrd as a key to first hash map and add ID as a value 
		userinfo.put(usrA.getID(), usrA); //add ID as a key and newAccount object as a value
		usernamesAndPasswords.put(usrA.getusername(), usrA.getpassword());
		
		try {
			FileOutputStream fileout = new FileOutputStream("Creds.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileout);
			objectOut.writeObject(userCreds);
			objectOut.close();
			System.out.println("The user information was logged.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		try {
			FileOutputStream fileout = new FileOutputStream("users.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileout);
			objectOut.writeObject(userinfo);
			objectOut.close();
			System.out.println("The user information was logged.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

		try {
			FileOutputStream fileout = new FileOutputStream("UserNames_Passwords.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileout);
			objectOut.writeObject(usernamesAndPasswords);
			objectOut.close();
			System.out.println("The user information was logged.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		}
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	public  void createJointAct() {   //option 2
		int jointTemp = 0;
		
		newAccount usrA = new newAccount();
		newAccount usrB = new newAccount();
		
		
		
		usrA.newAccount(); //creates name, usrnm, pswrd, 0 balance, and ID
		
		
		IDcheck(usrA, usrA.getID());
		
		
		
		if (usernamesAndPasswords.containsValue(usrA.getusername()) != false) {//check if ID exists
			System.out.println("That username is taken");
			System.out.println("Please give a different name");
			usrA.diffName(usrA, usernamesAndPasswords ,usernamesAndPasswords.containsValue(usrA.getusername()) == true);
			System.out.println(" ");
			
		
		}
		userCreds.put(usrA.getusername()+usrA.getpassword(), usrA.getID());//adds concatenated string of usrnm and pswrd as a key to first hash map and add ID as a value 
		userinfo.put(usrA.getID(), usrA); //add ID as a key and newAccount object as a value
		usernamesAndPasswords.put(usrA.getusername(), usrA.getpassword());
		
			
		
		
		System.out.println(" ");
		System.out.println("Please enter second user's information");
		usrB.information();
		jointTemp = usrA.getID();
		usrB.setID(jointTemp);
		
		if (usernamesAndPasswords.containsValue(usrB.getusername()) != false) {//check if ID exists
			System.out.println("That username is taken");
			System.out.println("Please give a different name");
			usrA.diffName(usrA, usernamesAndPasswords ,usernamesAndPasswords.containsValue(usrA.getusername()) == true);
			System.out.println(" ");
			
		
		}
		userCreds.put(usrB.getusername()+usrB.getpassword(), usrB.getID());//adds concatenated string of usrnm and pswrd as a key to first hash map and add ID as a value 
		userinfo.put(usrB.getID(), usrA); //add ID as a key and newAccount object as a value
		usernamesAndPasswords.put(usrB.getusername(), usrB.getpassword());
			
			
		
			try {
				FileOutputStream fileout = new FileOutputStream("Creds.txt");
				ObjectOutputStream objectOut = new ObjectOutputStream(fileout);
				objectOut.writeObject(userCreds);
				objectOut.close();
				System.out.println("The user information was logged.");
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			
			try {
				FileOutputStream fileout = new FileOutputStream("users.txt");
				ObjectOutputStream objectOut = new ObjectOutputStream(fileout);
				objectOut.writeObject(userinfo);
				objectOut.close();
				System.out.println("The user information was logged.");
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}

			try {
				FileOutputStream fileout = new FileOutputStream("UserNames_Passwords.txt");
				ObjectOutputStream objectOut = new ObjectOutputStream(fileout);
				objectOut.writeObject(usernamesAndPasswords);
				objectOut.close();
				System.out.println("The user information was logged.");
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			
			
			
			
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public  void Login() {   //option 3	
		String tempString;
		
		System.out.println("Please Enter your username");
		String uName = input.nextLine();
		
		System.out.println("Please Enter your password");
		String uPass = input.nextLine();
		
		if(uName == "Employee1") {    //Employee login
			if (uPass == "Company1") {
				employee();
			}
			
		}
		
		if(uName == "BankAdmin1") { //Bank Admin login
			if (uPass == "Corp1") {
				BAdmin();
			}
			
		}
		
		tempString = uName + uPass;
		tempstr = tempString;
		
		getUserCredentials();
				
		if(userCreds.containsKey(tempString)) {
			AccountHome();
		
				}
		else{
			System.out.println("invalid entry");
			System.out.println(" ");
			
			Login();
		}
	}
	
	
	
	public  void getUsernames() {
		
		
	     try {
	    	HashMap<String, String> tempMap = null;
	        FileInputStream fileIn = new FileInputStream("UserNames_Passwords.txt");
	        ObjectInputStream in = new ObjectInputStream(fileIn);
	        tempMap = (HashMap) in.readObject();
	        in.close();
	        fileIn.close();
	        usernamesAndPasswords = tempMap;
	     } 
	     catch (IOException i) {
	        i.printStackTrace();
	        return;
	     } 
	     catch (ClassNotFoundException c) {
	        System.out.println("Employee class not found");
	        c.printStackTrace();
	        return;
	     }
	     
	     
//	     System.out.println("Deserialized Employee...");
//	     System.out.println("Name: " + tempUsr.getFirstName());
//	     System.out.println("Address: " + tempUsr.getLastName());
//	     System.out.println("SSN: " + tempUsr.getusername());
//	     System.out.println("Number: " + tempUsr.getpassword());
	  }

	public  void getUserCredentials() {
	
	
    try {
   	HashMap<String, Integer> tempMap = null;
       FileInputStream fileIn = new FileInputStream("Creds.txt");
       ObjectInputStream in = new ObjectInputStream(fileIn);
       tempMap = (HashMap) in.readObject();
       in.close();
       fileIn.close();
       userCreds = tempMap;
    } 
    catch (IOException i) {
       i.printStackTrace();
       return;
    } 
    catch (ClassNotFoundException c) {
       System.out.println("Employee class not found");
       c.printStackTrace();
       return;
    }
    
    

 }





	public void AccountHome() {

		System.out.println("Select an option below by entering the coresponding number...");
		System.out.println("1. View account information");
		System.out.println("2. Make a deposit");
		System.out.println("3. Make a withdrawl");
		System.out.println("4. Transfer funds");
		System.out.println("5. Exit");
		String option = input.nextLine();
		
		
		
		

			 if(option.equals("1")) {
			viewinfo();
		}

		else if(option.equals("2")) {
			deposit();
		}

		else if(option.equals("3")) {
			withdraw();
		}
		else if(option.equals("4")) {
			transfer();
		}
		else if(option.equals("5")) {
			exit();
		}
		else {
			System.out.println("invalid entry");
			System.out.println(" ");
			
			AccountHome();
		}

	}
	
	public void BAdmin() {
		
	}
	
	public void getAllUserInfo() {
		
	}
	
	public  void getUserInfo() {
        try {
          HashMap<Integer, newAccount> tempMap = null;
          FileInputStream fileIn = new FileInputStream("users.txt");
          ObjectInputStream in = new ObjectInputStream(fileIn);
          tempMap = (HashMap) in.readObject();
          in.close();
          fileIn.close();
          userinfo = tempMap;
       } 
       catch (IOException i) {
          i.printStackTrace();
          return;
       } 
       catch (ClassNotFoundException c) {
          System.out.println(" class not found");
          c.printStackTrace();
          return;
       }



    }

	
	
	
	 public void viewinfo() {
	        getUserInfo();
	        getUserCredentials();
	        newAccount usr = new newAccount();
	        Integer temp;
	        
	        temp = userCreds.get(tempstr);
	        usr =  userinfo.get(temp);
	        
		     System.out.println("Deserialized Account...");
		     System.out.println("First Name: " + usr.getFirstName());
		     System.out.println("Last Name: " + usr.getLastName());
		     System.out.println("Username: " + usr.getusername());
		     System.out.println("Password: " + usr.getpassword());
		     System.out.println("Your balance is: " + usr.getbalance());
		     System.out.println("Your Account ID is: " + usr.getID());
		     System.out.println("Verified: " + usr.getverification());
	    }
	
	
	
	public void employee() {
		
	}
	
	
	
	public  void verify() {
		
	}
	
	
	
	public  void withdraw() {
		 	getUserInfo();
	        getUserCredentials();
	        newAccount usr = new newAccount();
	        Integer temp;

	        //temp == key
	        temp = userCreds.get(tempstr);

	        //to access user info
	        usr =  userinfo.get(temp);

	        System.out.print("Enter How Much You Would like To Withdraw: $");
	        int withdrawAmount = input.nextInt();
	        if(usr.getbalance() < withdrawAmount) {
	        	System.out.println("Insufficient Amount In Balance!\nPlease Try Again!");
	        	withdraw();
	        }
	        else if(usr.getbalance() == 0){
	        	System.out.println("Account Balance is $0");
	        }
	        else if(usr.getbalance() < 0) {
	        	System.out.println("Account Balance is Negative: " + usr.getbalance());
	        }
	        else {
	        	usr.setBalance(usr.getbalance()- withdrawAmount);
	        	userinfo.put(temp,  usr);
	        	
	            try {
	                FileOutputStream fileout = new FileOutputStream("users.txt");
	                ObjectOutputStream objectOut = new ObjectOutputStream(fileout);
	                objectOut.writeObject(userinfo);
	                objectOut.close();
	                System.out.println("The user information was logged.");
	            }
	            catch(Exception ex) {
	                ex.printStackTrace();
	            }

	        }
	}

	
	
	public  void deposit() {
        getUserInfo();
        getUserCredentials();
        newAccount usr = new newAccount();
        Integer temp;

        //temp == key
        temp = userCreds.get(tempstr);

        //to access user info
        usr =  userinfo.get(temp);

        System.out.println("Enter How Much You Would like To Deposit: $");
        int updateBalance = input.nextInt() + usr.getbalance();
        usr.setBalance(updateBalance);
        
        userinfo.put(temp, usr);


          try {
              FileOutputStream fileout = new FileOutputStream("users.txt");
              ObjectOutputStream objectOut = new ObjectOutputStream(fileout);
              objectOut.writeObject(userinfo);
              objectOut.close();
              System.out.println("The user information was logged.");
          }
          catch(Exception ex) {
              ex.printStackTrace();
          }


  }

	
	
	public  void transfer() {
		
	}
	
	
	
	public  void exit() { // this method  does not need any code
		
	}
	
	
	

	
	}
	
	

