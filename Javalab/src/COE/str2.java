package COE;

public class str2 {
	public static void main(String args[])
	{
		String s1="CST";
		String s2="CST";
		String s3=new String("CST").intern();
		String s4=new String("CST").intern();
		System.out.println(s1+" "+s2+" "+s3+" "+s4);
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1==s2);
		System.out.println(s1==s4);
		String s6=new String("cst").intern();
		System.out.println(s1.equals(s6));
		System.out.println(s1.equalsIgnoreCase(s6));
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		String s8="gprec";
		System.out.println(s8.substring(2));
		System.out.println(s8.substring(0,2));
		System.out.println(s8.concat(s2));
	}

}
