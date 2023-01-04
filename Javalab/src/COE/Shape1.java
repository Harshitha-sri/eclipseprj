package COE;

public class Shape1
{
	public void area()
	{
       System.out.println("Area of shape class");
	}
}
class rectangle extends Shape1
{
	public void area(int a,int b)
	{
		System.out.println("Area of rectangle: "+(a*b));
	}
}
class square extends Shape1
{
	public void area(int side)
	{
		System.out.println("Area of square: "+(side*side));
	}
}


/*method overloading */