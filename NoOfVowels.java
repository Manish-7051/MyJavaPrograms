// Write a program to count vowels in a string.
import java.util.Scanner;
public class NoOfVowels
    {
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a String");
	    String s=sc.nextLine();
	    int count=0;
	    s=s.toLowerCase();
	    for(int i=0;i<s.length();i++){
	    char ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        
         count++;
    
        }
    
    }	    if(count>0){
		System.out.println("it contains "+count+" number of vowels");
     	}
	     else{
	    
	    System.out.println("it doesn't contains vowels");
	    
	    
	}
	    
	}
}
