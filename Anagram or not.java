/*Write a java program to find the given two strings are Anagram or not.
Anagrams means if two String have same characters but in different order.
Example: Kumar and uKmar are anagrams
If the given strings are anagrams then print true otherwise print false
Input Format:
    First line contains first string and Second line contains second string
Output Format:
    A line contains true if strings are anagrams otherwise it contains false
Note:
1. The input strings are case sensitive and it contains characters(a...z and A...Z) only.
2. If the input string contains other than characters then print "Invalid String" (without quotes)

sample I/O:
Kumar
uKmar
*/
=====================================================================================================
PROGRAM:
import java.util.*;
class Anagram
{
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int count=0;
        String in1=sc.next();
        String in2=sc.next();
        if(in1.length()==in2.length())
        {
            for(int i=0;i<in1.length();i++)
            {
               if(Character.isUpperCase(in1.charAt(i)) || Character.isLowerCase(in1.charAt(i)))
               {}
               else
               count++;
               if(Character.isUpperCase(in2.charAt(i)) || Character.isLowerCase(in2.charAt(i)))
               {}
               else
               count++;
               if(count!=0)
               {
                   System.out.print("Invalid String");
                   break;
               }
            }
            if(count==0)
            {
        for(int i=0;i<in1.length();i++)
        {
            c=0;
            for(int j=0;j<in2.length();j++)
            {
                if(in1.charAt(i)==(in2.charAt(j)))
                c++;
            }
            if(c==0)
            {
                System.out.print("false");
                break;
            }
        }
        if(c!=0)
        System.out.print("true");
        }
        }
        else
        {
            System.out.print("false");
        }
    }
}


