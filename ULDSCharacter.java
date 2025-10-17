//6. Check if a character is uppercase, lowercase, digit, or special symbol.

import java.util.Scanner;
public class ULDSCharacter
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter something");
	    char ch =sc.next().charAt(0);
	   if(ch>='a' && ch<='z'){
	        
	        System.out.println("IT IS LOWER CASE LETTER");
	        
	    }
	   else if(ch>='A' && ch<='Z'){
	        
	        System.out.println("IT IS UPPER CASE LETTER");
	        
	    }
	   else if(ch>='0' && ch<='9'){
	        
	        System.out.println("IT IS DIGIT");
	        
	    }
	 else{
	        
	        System.out.println("IT IS A SPECIAL CHARACTER");
	        
	    }
	 
	   
	}
}
