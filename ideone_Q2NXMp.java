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
	int fact=1;
	
		while(num!=0)
	{
		fact*=num;
		num--;
	}
	System.out.println("the factorial is:"+fact);
	}
}