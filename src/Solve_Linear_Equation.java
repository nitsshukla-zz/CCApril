//This is a sample program to solve the linear equations.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Solve_Linear_Equation 
{
    public static void main(String args[])
    {
    	Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for(int i3=0;i3<T;i3++){
			int n = input.nextInt();
			long[] list=new long[n];int sum=0;
			for(int i=0;i<n;i++){
				long num=input.nextLong();
				list[i]=num;sum+=num;
			}
			for(int i=0;i<n;i++)
				System.out.print(getO(list[i],sum,list[n-1],n)+" ");
			
			System.out.println();
		}
        input.close();
 
    }

	private static long getO(long integer, long sum, long integer2, int i) {
		//System.out.println(integer+" "+sum+" "+integer2+" "+i);
		return Math.round(sum-(i-1)*integer)/(i-1);
	}

}