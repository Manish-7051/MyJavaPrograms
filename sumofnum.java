// Find the sum of digits of a number.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number");
	    int num=sc.nextInt();
	    
	    int sum=0;
	    while(num!=0){
	        int digit=num%10;
	        sum=sum+digit;
	        num=num/10;
	        
	    }
	   System.out.println("sum is:"+sum);
	}
}
