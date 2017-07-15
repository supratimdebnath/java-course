
package javaapplication73;

import java.util.Scanner;

public class JavaApplication73 {

    public static void main(String[] args) {
         int a,b, flag = 0, i, j;
         Scanner s = new Scanner(System.in);
         a = s.nextInt();
         b = s.nextInt();
         for(i = a; i <= b; i++)
         {
             for( j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
             }
             if(flag == 1)
             {
                 System.out.println(i);
             }
         }
 
    }
    
}
