package gprec.math;
public class Arithmetic {
	public int sum(int fn,int sn)
	{
		return fn+sn;
	}
	public int sub(int fn,int sn)
	{
		return fn-sn;
	}
	public int mul(int fn,int sn)
	{
		return fn*sn;
	}
	public int div(int fn,int sn)
	{
		try
		{
			if(sn==0)
				throw new ArithmeticException("Divide by zero");
			else
		    return fn/sn;
		    
		}
		/*catch(ArithmeticException u)
		{
			System.out.println("Exception caught"+u.getMessage());
			return -1;
		}*/
		catch(Exception e2)
		{
			System.out.println("Exception caught "+e2.getMessage());
			
		}
		finally
		{
			System.out.println("Exception handled");
			return -1;
		}
		
	}
	
}
