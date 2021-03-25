//Fibonacci series
package recusrion;

import java.util.Scanner;
//This is my fibonacci series
public class Fib {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Number of elements in an array");
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Enter the choice--1 for recusive and 2 for non recursive solution");
		
		int choice=sc.nextInt();
		
		if(choice==1)
			System.out.println("Maximum number found without recursion "+max(arr,n));
		else
			if(choice==2)
				System.out.println("Maximum number found with recursion is "+maxrec(arr,n));
	}
	
	public static int max(int[] x,int n)
	{
		int max=x[0];
		for(int i=1;i<n;i++)
		{
			if(x[i]>max)
				max=x[i];
			
		}
		return max;
	}
	public static int maxrec(int[] x,int n)
	{
		if(n==1)
			return x[0];
		else
			return(Math.max(x[n-1], maxrec(x,n-1)));
		
	}
}
