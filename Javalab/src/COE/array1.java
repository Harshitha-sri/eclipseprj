package COE;

public class array1 {
	public static void main(String args[])
	{

       int[][] mat=new int[3][];
       mat[0]=new int[] {10,20,30};
       mat[1]=new int[] {1,2,3,4,5,6};
       mat[2]=new int[] {90};
       System.out.println("For each loop:");
       for(int x[]:mat)
       {
    	   for(int y:x)
    	   {
    		   System.out.println(""+y);
    	   }
    	   System.out.println();
       }

	}
}


//jagged arrays//