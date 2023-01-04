package pack1;

public class nonsubclass  {
	nonsubclass()
	{
		Sameclass sc=new Sameclass();
		 System.out.println("Default access specifier : "+sc.d);
   	 // System.out.println("Private access specifier : "+sc.p);
   	  System.out.println("Protected access specifier : "+sc.pro);
   	  System.out.println("Public access specifier : "+sc.a);
	}

}
