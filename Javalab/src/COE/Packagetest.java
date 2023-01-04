package COE;
//import gprec.math.Arithmetic;
import gprec.math.*;
import java.util.*;
public class Packagetest {

	public static void main(String[] args) {
		
		/*Arithmetic ob=new Arithmetic();
		System.out.println(ob.sum(20, 5));
		System.out.println(ob.sub(20, 5));
		System.out.println(ob.mul(20, 5));
		System.out.println(ob.div(20, 5));*/
		
       mat1 ob=new mat1();
       System.out.println("Enter number: ");
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       if(num==ob.reverse(num))
       {
    	   System.out.println("palindrome");
       }
       else
       {
    	   System.out.println("Not palindrome");
       }
	}

}
