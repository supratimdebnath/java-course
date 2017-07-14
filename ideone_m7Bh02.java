/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner A=new Scanner(System.in);
       System.out.println("enter the string to check");
       String a=A.nextLine();
                      
       StringBuilder sb=new StringBuilder();
       sb.append(a);// changes sb to a
       String b=sb.reverse().toString();
       
       System.out.printf("forward string is %s\n",a);
       System.out.printf("reverse string is %s\n",b);
	}
}