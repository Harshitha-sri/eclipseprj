package COE;

public class watch {

	public static void main(String[] args) {
	      java.util.Scanner sc=new java.util.Scanner(System.in);
	      long s=sc.nextLong();
	      long h=(s/3600)%24;
	      s=s%3600;
	      long m=s/60;
	      s=s%60;
	     // System.out.printf("%d:%0,2d:%0,2d",h,m,s);
	      System.out.printf(h+":"+String.format("%02d",m)+":"+String.format("%02d",s));

	}

}
