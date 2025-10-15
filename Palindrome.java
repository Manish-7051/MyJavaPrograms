import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a  string");
        String s=sc.nextLine();
        
        boolean  isPalindrome=true;
    int k=s.length();
        s=s.toLowerCase();
    int i=0,j=k-1;
      while(i<j){
          
          if(s.charAt(i)!=s.charAt(j)){
          isPalindrome=false;
          break;
          
          
    
          }
           i++;
          j--;
      }
    if(isPalindrome==true){
                
                System.out.println("it is a palindrome");
            }
            
    else
    {
                System.out.println("it is not a palindrome"); 
                
            }
            
            
        }
        
        
        
        
}
