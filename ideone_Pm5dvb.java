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
    int n=num;
    int sum=0;
    while (num!=0)
    {
        int res=num%10;
        sum=(sum*10)+res;
        num/=10;
    }
    if( n==sum)
        System.out.println("Palindrome");
    else
        System.out.println("Not possiible");
	}
}