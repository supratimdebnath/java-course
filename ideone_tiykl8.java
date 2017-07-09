/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int count=0;
	
	for(int i=2;i<=num/2;i++)
	if(num%i==0)
	{
		count++;
		break;
	}
	
	if (count==0)
    	System.out.println("prime number");
    else
	    System.out.println("not a prime number");
	}
}