package gprec.math;

public class mat1 {
public int pow(int a,int b)
{
	int res=1;
	for(int i=1;i<=b;i++)
		res=res*a;
	return res;
}
public int reverse(int num)
{
	int rev=0;
	while(num>0)
	{
		rev=rev*10+num%10;
		num=num/10;
	}
	return rev;
}
}
