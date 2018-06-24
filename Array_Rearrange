/*Question :

Write a java program to rearrange the array such that even positioned are greater than odd
Note : consider the following conditions to rearrange the array arr
Condition 1 : arr[i]>=arr[i-1], if i is even
Condition 2 : arr[i]<=arr[i-1], if i is odd
Input Format:
    First line contains an integer N(size of the array) and second line contains N elements separated by space(array elements).
Output Format:
    A line contains resulting array elements separated by space.*/
=============================================================================================================================	
PROGRAM:
import java.util.*;
class EvenArray
{
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int l=0;
        int m=n-1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
               System.out.print(a[l]+" ");
               l++;
            }
            else
            {
                  System.out.print(a[m]+" ");
                  m--;
            }
            
        }
    }
}

