package COE;

public class Fruit
{
	String size,name,taste;
	void eat()
	{
		System.out.println("Eating fruits: ");
	}
}
class Apple extends Fruit
{
	Apple()
	{
		name="Apple";
		taste="sweet";
	}
	void eat()
	{
		System.out.println(name + " is " + taste);
	}
}
class Orange extends Fruit
{
	Orange()
	{
		name="Orange";
		taste="sweet";
	}
	void eat()
	{
		System.out.println(name + " is " + taste);
	}
}
