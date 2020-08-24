import java.util.*;
import java.util.Random;

public class newAccount implements java.io.Serializable  {
	
	//variables for storing their information
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private int uniqueID;
	private int balance;
	private boolean verified;
	Random rand = new Random();
	
	
	public void newAccount() {
		System.out.println("\nWelcome New User to the Bank App!");
		System.out.println("Please fill out the information below.");
		
		//calls the information method to be able to input the data/information
//		information();
		
		information();
	}
	
	
	
	
	//Asks for information and stores the inputs in the variables
	public void information() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("First Name: ");
		firstName = input.nextLine();
		System.out.print("Last Name: ");
		lastName = input.nextLine();
		System.out.print("Username: ");
		username = input.nextLine();
		System.out.print("password: ");
		password = input.nextLine();
		createID();
		balance = 0;
		verified = false;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getusername() {
		return username;
	}
	
	public String getpassword() {
		return password;
	}
	///////////////////////////////////////////
	public int getbalance() {
		return balance;
	}
	public boolean getverification() {
		return verified;
	}
	

	public int createID() {
		
		uniqueID = rand.nextInt(100);
		return uniqueID;
		
	}
	
	public int setID(int a) {
		uniqueID = a;
		return uniqueID;
	}

	public int getID() {
		return uniqueID;
	}
	
	public void setBalance(int a) {
		this.balance = a;
	}
	
	
	
	
	public void diffName(newAccount X, HashMap Y , boolean badname) {
		System.out.println("That username is taken");
		System.out.println("Please give a different name");
		Scanner reinput = new Scanner(System.in);

		
		while(badname == true) {
			System.out.println("That username is taken");
			System.out.println("Please give a different name");
			System.out.println(" ");
				
		username = reinput.nextLine();
		badname = Y.containsValue(X.getusername());
			
		}
		
		getusername();
		
	}
	
	
	
	
	
	
}
