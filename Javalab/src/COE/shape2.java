package COE;

/*public class shape2 {
	public void area(double d)
	{
		System.out.println("Area of shape with parameter : "+d);
	}

}
class circle extends shape2
{
	public void area(double r)
	{
		System.out.println("Area of circle: "+3.14*r*r);
	}
}
class square1 extends shape2
{
	public void area(double r)
	{
		System.out.println("Area of square: "+r*r);
	}
}
/*overriding */

public interface shape2 {
	public void area(double d);
	

}
class circle implements shape2
{
	public void area(double r)
	{
		System.out.println("Area of circle: "+3.14*r*r);
	}
}
class square1 implements shape2
{
	public void area(double r)
	{
		System.out.println("Area of square: "+r*r);
	}
}


/*
public abstract class shape2 {
	public abstract void area(double d);
	
}
class circle extends shape2
{
	public void area(double r)
	{
		System.out.println("Area of circle: "+3.14*r*r);
	}
}
class square1 extends shape2
{
	public void area(double r)
	{
		System.out.println("Area of square: "+r*r);
	}
}
*/

