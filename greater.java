import java.util.Scanner;
public class greater
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a value ");
	    int a=sc.nextInt();
	    System.out.println("Enter b value ");
	    int b=sc.nextInt();
	    System.out.println("Enter c value ");
	    int c=sc.nextInt();
	    
	    int max=Math.max(a,Math.max(b,c));
	    
		System.out.println("MAX iS "+max);
	}
}
