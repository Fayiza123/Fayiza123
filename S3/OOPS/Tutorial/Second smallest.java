//Fayiza K H
//S3 CSE(AI)
//Rollno:28
import java.util.Scanner;
class secondsmallest
{
     public static void main(String args[])
     {
         int i,j,temp,n;
         int arr[]= new int[50];
         Scanner S=new Scanner(System.in);
         System.out.println("Enter the limit of the array:");
         n=S.nextInt();
         System.out.println("Enter the array elements:");
         for(i=0;i<n;i++)
         {
            arr[i]=S.nextInt();
         }
         for(i=0;i<n-1;i++)
         {
            for(j=0;j<n-i-1;j++)
            {
               if(arr[j]>arr[j+1])
               {
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
            }
          }
          System.out.println("The second smallest element is:" +arr[1]);
          S.close();
     }
}
