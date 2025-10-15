//16. Write a program to find the largest and smallest element in an array.
import java.util.Scanner;
public class L&gInArr
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter array size");
	    int n=sc.nextInt();
	    
	     int[] arr = new int[n];
	     System.out.println("Enter an array elements");
	     for(int i=0;i<n;i++){
	         
	         arr[i]=sc.nextInt();
	         
	     }
	       int lar=arr[0];
	       int smallest=arr[0];
	       
	       for(int i=0;i<n;i++){
	         if(arr[i]>lar){
	             lar=arr[i];
	             
	         }
	         if(arr[i]<smallest){
	             smallest=arr[i];
	             
	         }
	        
	         
	     }
	     
	     
	 
	 
	    System.out.println("smallest is"+smallest);
	     System.out.println("greatest is"+lar);
	   
	}
	
}
