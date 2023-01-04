package COE;

public class Shape
{
      void area(double radius)
      {
    	  System.out.println("Area of circle: "+(3.14*radius*radius));
      }
      int area(int side)
      {
    	  return side*side;
      }
      void area(int length,int breadth)
      {
    	  System.out.println("Area of rectangle: "+(length*breadth));
      }
      double area(double base,double height)
      {
    	  return 0.5*base*height;
      }
}
