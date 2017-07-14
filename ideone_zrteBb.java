/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,fact=1;  
  Scanner s=new Scanner(System.in);
  int number=s.nextInt();
  fact = factorial(number);   
  System.out.println("Factorial of number"+fact); 
	}
}