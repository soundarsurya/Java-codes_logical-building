/*
Equal word

A sentence is given as input which contains multiple words. You need to find and print the Equal word.
Rules to find the Equal word in the given sentence is given below
1. Length of the word must be even.
2. Word should contains equal number of upper case and lower case letters.
3. Word should contains only alphabetic characters.

Note1: Each word in the sentence may be the combination of upper case letters,lower case letters, digits, special characters.
Note2: The given sentence contains only one Equal word

Example 1:
   Input: Waiting to fAcE New Challenges 
         In the given input sentence the Equal word is fAcE because this is the only word satisfies all rules
Example 1:
   Input: Waiting To fA2cE New Challenges 
         In the given input sentence the Equal word is To because this is the only word satisfies all rules.
         
Runtime Input : 
Waiting to fAcE New Challenges

Output : 
fAcE
*/
===========================================================================================================================================
//program
import java.util.*;
public class equalword
{
    public static void main(String src[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sa[]=s.split(" ");
        for(int i=0;i<sa.length;i++)
        {
            if(sa[i].length()%2==0)
            {
                int upper=0,lower=0,others=0;
                for(int j=0;j<sa[i].length();j++)
                {
                    if(Character.isUpperCase(sa[i].charAt(j)))
                    {
                        upper++;
                    }
                    else if(Character.isLowerCase(sa[i].charAt(j)))
                    {
                        lower++;
                    }
                    else
                    {
                        others++;
                    }
                }
                if(upper==lower && others==0)
                {
                    System.out.println(sa[i]);
                }
            }
        }
    }
}
