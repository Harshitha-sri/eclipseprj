package COE;
import java.util.*;
public class str3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();;
		StringBuffer sb=new StringBuffer(s1);
		//System.out.println(sb.reverse());
		sb.reverse();
		if(s1.contentEquals(sb))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
