import java.util.ArrayList;
import java.util.HashMap;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; 
import java.util.Scanner;

public class triangleNswitch {
	
	static int a;
	static int b;
	
	static void binaryTri() {
		System.out.println(" ");
		
		
		triangleNswitch.a = 0;
		triangleNswitch.b = 1;
		
				
		for(int a = 1; a<5; a++) {
			int t = 1;
			
			
				
				if (t<=a) {
					t=t+1;
					System.out.print(triangleNswitch.a);
					
				}
				if (t<=a) {
					t=t+1;
					System.out.print(triangleNswitch.b);
					
				}
        if (t<=a) {
					t=t+1;
					System.out.print(triangleNswitch.a);
					
				}
				if (t<=a) {
					t=t+1;
					System.out.print(triangleNswitch.b);
					
				}
				
				System.out.println(" ");
			
		}
		
		
		
	}
	
	
	

	static void switchS1() {

    int option;
	Scanner scan =new Scanner(System.in);
	System.out.println("choices 1-3:");
	System.out.println("1. square root of a number");
	System.out.println("2. date.");

	System.out.println("3. Split the following string and store it in a string array. “I am learning Core Java”");

	option =scan.nextInt();


	switch(option){
	case 1:
	System.out.println("What number do you want to find the square root of?");
	int x=scan.nextInt();
	double sr =Math.sqrt(x);
	System.out.println("Square root: " + sr);
	break;

	case 2:
	DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	LocalDateTime present = LocalDateTime.now();
	System.out.println(datetime.format(present));
	break;

	case 3:
	String phrase="I am learning Core Java";
	String[] array =phrase.split(" ");
	for(int i=0;i<array.length;i++){
	System.out.println(array[i] + " " + i);
	  }
	}
	}
	  
	  

	
	
	
	
	
	
	
	

}
