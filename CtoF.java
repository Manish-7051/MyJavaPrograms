import java.util.Scanner;
public class CtoF
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Temperature in celsius ");
	    double celsius=sc.nextDouble();
	    double farenheit=(celsius*(9.0/5.0))+32;
	    
	    
	    
		System.out.println("Temperature in Farenheit "+farenheit+"F");
	}
}
