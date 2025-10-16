import java.util.Scanner;
public class FtoC
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Temperature in Farenheit ");
	    double farenheit=sc.nextDouble();
	    double celsius=(farenheit-32)*(5.0/9.0);
	    
	    
	    
		System.out.println("Temperature in Celsius "+celsius+"C");
		sc.close();
	}
}
