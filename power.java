import java.util.Scanner;
public class C_interest
{
	public static void main(String[] args) { 
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter B : ");
	    int B=sc.nextInt();
	    System.out.print("Enter E : ");
	    int E=sc.nextInt();
	   
	    
	    
	    int result=1;
	    for(int i=1;i<=E;i++){
	        result=result*B;
	        
	    }
	    

	    
	    
		System.out.println("remainder is : "+result);
		sc.close();
	}
}
