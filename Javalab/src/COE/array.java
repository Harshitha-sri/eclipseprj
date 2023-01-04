package COE;
import java.util.*;
public class array {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		
	    int  arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	arr[i]=sc.nextInt();
	    
	    }
	    System.out.println("Enter a number: ");
	    int a=sc.nextInt();
	    for(int i=0;i<arr.length-1;i++)
	    {
	    	if(a==arr[i])
	    	{
	    		System.out.println(i);
	    	}
	    } 
	}
	
	

}
