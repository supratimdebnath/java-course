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
    int new_num=s.nextInt();
    int result=0,num,rem;
    num=new_num;
    
    while(num!=0)
    {
        rem=num%10;
        result+=rem*rem*rem;
        num=num/10;
    }
    if(result==new_num)
        System.out.println("An armstrong number");
    else
        System.out.println("Not possiible");
	}
}