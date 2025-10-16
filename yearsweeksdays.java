import java.util.Scanner;
public class yearsweeksdays
{
	public static void main(String[] args) { 
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter total numbers of days : ");
	    int total_days=sc.nextInt();
	    
	    int years1=total_days/365;
	    int remaining_days=total_days%365;
	    int weeks1=remaining_days/7;
	    int days1=remaining_days%7;
	    
	  
	    System.out.println(" years "+years1+", week "+weeks1+", days "+days1);

	    sc.close();
	}
}
