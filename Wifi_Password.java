/*Taj hotel has an wifi and the management has a plan to change the wifi password daily. Each room in the hotel contains a five-digit number and a name(single word). The management framed set of rules to generate password daily from the room number and its name. 
Rules to generate wifi password
1.    Length of the wifi password should be four.
2.    Password contains both digits and characters
3.    First position of the password is max(maximum value) digit in the room number
4.    Second position of the password is chosen based on length of the room name. If the length is odd use # otherwise use $
5.    Third position of the password is min(minimum value) digit in the room number
6.    Fourth position of the password is middle character in the room name. Find the middle character position in the room name by (length of the room name)/2.
The hotel management is felt it is difficult to find the password manually. So write a code in java and help them to generate the password.
Note: 
1.    Room name contains both upper case and lower case letters
2.    If the number is not a five-digit number, then print password as 0000(all are zero)

Input Format:
    First line contains a five digit number(room number) and second line contains a string(Room name)
Output Format:
    A line contains four digit password.
   
 Sample I/O:
 45451
 TajFirst
    
=============================================================================================================================
PROGRAM:
import java.util.Scanner;
class TajPassword
{
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        String name=sc.next();
        int b=0;
        int c=9;
        if(no>9999 && no<100000)
        {
        while(no>0)
        {
            int a=no%10;
            if(a>b)
            b=a;
            if(a<c)
            c=a;
            no=no/10;
        }
        System.out.print(b);
        if(name.length()%2==0)
        System.out.print("$");
        else
        System.out.print("#");
        System.out.print(c);
        System.out.print(name.charAt(((name.length())/2)));
        }
        else
        System.out.print("0000");
    }
}

