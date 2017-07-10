/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,x,flag = 0, i, j;
         Scanner s = new Scanner(System.in);
         a = s.nextInt();
         b = s.nextInt();
         for(i = a+1; i <= b; i++)
         {
             for( j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
          		flag = 1;
                
             }
             if(flag == 1)
             {
                 System.out.println(i);
             }
          }
	}
}