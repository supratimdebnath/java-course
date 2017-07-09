/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		System.out.println("the even list is");
		for(int i=a;i<=b;i++)
			if(i%2==0)
			System.out.println(i);
	}
}