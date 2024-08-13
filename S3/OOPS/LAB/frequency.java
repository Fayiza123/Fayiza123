//FAYIZA K H
//S3 CSE(AI)
//Rollno:28
import java.util.*;
class frequency
{
     public static void main(String args[])
     {
         Scanner S1=new Scanner(System.in);
         String str;
         int frequency=0;
         System.out.println("Enter the string:");
         str=S1.nextLine();
         str=str.toLowerCase();
         System.out.println("Enter a character to check:");
         char c=S1.next().charAt(0);
         int length=str.length();
         for(int i=0;i<length;i++)
         {
             if(str.charAt(i)==c)
             {
                 frequency++;
             }
         }
         System.out.println("The frequency of the character'"+c+"'is" +frequency);
         S1.close();
     }
}
