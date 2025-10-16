import java.util.Scanner;
public class Main
{
	public static void main(String[] args) { 
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter A : ");
	    int A=sc.nextInt();
	    System.out.print("Enter B : ");
	    int B=sc.nextInt();
	   
	    
	    
	    double remainder=A%B;
	    

	    
	    
		System.out.println("remainder is : "+remainder);
		sc.close();
	}
}
