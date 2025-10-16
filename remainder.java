import java.util.Scanner;
public class remainder
{
	public static void main(String[] args) { 
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Divident: ");
	    int Divident=sc.nextInt();
	    System.out.print("Q : ");
	    int Q=sc.nextInt();
	    System.out.print("Divisor: ");
	    int Divisor=sc.nextInt();
	    
	    
	    
	    double remainder=Divident-(Q*Divisor);

	    
	    
		System.out.println("remainder is : "+remainder);
		sc.close();
	}
}
