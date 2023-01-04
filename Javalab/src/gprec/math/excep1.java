package gprec.math;

import java.util.Scanner;

public class excep1 {
	public static void main(String[] args) {
		Arithmetic ar=new Arithmetic();
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the values : ");
		a=sc.nextInt();
		b=sc.nextInt();
        System.out.println(ar.sum(a,b));
        System.out.println(ar.sub(a,b));
        System.out.println(ar.mul(a,b));
        System.out.println(ar.div(a,b));
        sc.close();
	}
}
