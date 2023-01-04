package COE;
import java.util.*;
public class str4 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s1,s2;
	System.out.println("String1:");
	s1=sc.nextLine();
	System.out.println("String2:");
	s2=sc.nextLine();
	if(s1.charAt(s1.length()-1)==s2.charAt(0))
	{
	System.out.println(s1.concat(s2.substring(1)));
	}
	else
	{
		System.out.println(s1.concat(s2));
	}
}
}
