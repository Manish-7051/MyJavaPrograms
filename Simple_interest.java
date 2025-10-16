import java.util.Scanner;
public class Simple_interest
{
	public static void main(String[] args) { 
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Principal: ");
	    int Principal=sc.nextInt();
	    System.out.print("Time: ");
	    int Time=sc.nextInt();
	    System.out.print("Rate : ");
	    int Rate=sc.nextInt();
	    
	    
	    double Simple_interest=(Principal*Time*Rate)/100;
	    
	    
	    
		System.out.println("SI is : "+"₹"+Simple_interest);
		sc.close();
	}
}
