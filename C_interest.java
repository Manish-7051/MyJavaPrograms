import java.util.Scanner;
public class C_interest
{
	public static void main(String[] args) { 
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Principal: ");
	    int Principal=sc.nextInt();
	    System.out.print("Rate : ");
	    int Rate=sc.nextInt();
	    System.out.print("Time: ");
	    int Time=sc.nextInt();
	    
	    
	    
	    double Amount=Principal*Math.pow((1+Rate/100.0),Time);
	    double CI=Amount-Principal;
	    
	    
		System.out.println("CI is : "+"₹"+CI);
		sc.close();
	}
}
