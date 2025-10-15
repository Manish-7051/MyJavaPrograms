//checking whether three points lie on a straight line using the slope method.
import java.util.Scanner;
public class Threepointslie
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a x1");
	    int x1=sc.nextInt();
	    System.out.println("Enter a x2");
	    int x2=sc.nextInt();
	    System.out.println("Enter a x3");
	    int x3=sc.nextInt();
	    System.out.println("Enter a y1");
	    int y1=sc.nextInt();
	    System.out.println("Enter a y2");
	    int y2=sc.nextInt();
	    System.out.println("Enter a y3");
	    int y3=sc.nextInt();
	    
	    
	    if((y2-y1)*(x3-x1)==(y3-y1)*(x2-x1)){
	        
	         System.out.println("It is a straight line");
	        
	        
	        
	    }
	    else {
	        
	        
	         System.out.println("it is not a straight line");
	        
	    }
	 
	 
	   
	   
	}
	
}
