//pgm to read a line integers and then display each integers and sum of all integers
//Fayiza K H
//Rollno:28
import java.io.*;
class SumOfIntegers
{
   public static void main(String args[])
   {
       BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
       String line;
       int sum=0;
       
       try{
          System.out.println("Enter a line of integers separated by spaces:");
          line=reader.readLine();
          String[] numbers=line.split(" ");
          
          for(String number:numbers)
          {
             int num=Integer.parseInt(number);
             System.out.println(num);
             sum+=num;
          }
          
          System.out.println("Sum of all integers:"+sum);
          }
          catch(IOException e)
         {
           System.out.println("an error occured while reading input:" +e.getMessage());
         }
         catch(NumberFormatException e)
         {
             System.out.println("Invalid input.Plase enter valid integers.");
         }
    }
}  
         
   
