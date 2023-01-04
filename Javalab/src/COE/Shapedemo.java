package COE;

public class Shapedemo {

	public static void main(String[] args) {
		Shape ob=new Shape();
		ob.area(2.55);
		System.out.println("Area of square : "+ob.area(5));
		ob.area(5,6);
		System.out.println("Area of triangle : "+ob.area(2.20,6.5));

	}

}
