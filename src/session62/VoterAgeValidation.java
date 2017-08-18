/**
 * VoteAgeValidation.java
 * version 1.1
 * Compiled on 16th Aug 2017
 * 
 */
//package declaration
package session62;

//importing the Scanner class for java.util package for acceptance of user input from command prompt

import java.util.Scanner ;
/**
 * 
 * This class will illustrate the VoterAgeValidation class which take voter's age as a user input and determines whether user has provided positive age or not.
 * if User provides negative value for age then user-defined Exception NegativeAgeException should be thrown as part of exception handling.
 * 
 * @author chhaya yadav
 *
 */
//class declaration

public class VoterAgeValidation {
	
//main method declaration	
	
	public static void main(String[] args){
		
//Scanner class declaration and instantiation
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter the age for Voter");
		
//try block for the code that can generate exception at runtime
		
		try{
			
//Taking User input for valid age value
			
		int age = inp.nextInt();

//throwing user-defined exception Exception	
		
		throw new NegativeAgeException(age) ;
				
		}
		
//catch block for the user-defined exception explicitly
		
		catch(NegativeAgeException nae){
			
			System.out.println("Customized NegativeAgeException Block reached !");
			
		}
//finally block to execute the blocks of code that should run despite of exception generated , thus closing the Scanner class object		
		
		finally{
			
		inp.close(); 
		
		}
	}
	

}
