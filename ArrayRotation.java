package rotate.array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
     
    RotateArray rotate=new RotateArray(); 
    Scanner s=new Scanner(System.in);
    System.out.println("enter size");
    int n=s.nextInt();
    int a[] = new int[n];
    System.out.println("Enter all the elements:");
    for(int i = 0; i < n; i++)
        a[i] = s.nextInt();
    System.out.println("enter no of test cases");
    int k=s.nextInt();
    rotate.Arotate(a,n,k);
    for(int i=0;i<n;i++)
        System.out.printf("%d  ",a[i]);
    
}

void Arotate(int a[],int n,int test)
{
    int x=0;
    while(x<test)
    {
        int temp=a[n-1];
        for(int i=n-1;i>=1;i--)
            a[i]=a[i-1];
        a[0]=temp;
    x++;
}}}
