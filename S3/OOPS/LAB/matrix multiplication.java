//pgm to multiply two matrices
//Fayiza K H
//Roll no:28
import java.util.*;
class matrixmultiply
{  public static void main(String args[])
   {
     int[][]matrix1=new int[50][50];
     int[][]matrix2=new int[50][50];
     int[][]product=new int[50][50];
     int i,j,k;
     Scanner s=new Scanner(System.in);
     System.out.println("enter the no: of rows and columns of first matrix \n");
     int row1=s.nextInt();
     int col1=s.nextInt();
     System.out.println("enter the no: of rows and columns of second matrix\n");
     int row2=s.nextInt();
     int col2=s.nextInt();
     if(col1!=row2)
     {
       System.out.println("the product is not possible");
       s.close();
       return;
     }
     System.out.println("enter the elements of first matrix");
     {
         for(i=0;i<row1;i++)
         {
           for(j=0;j<col1;j++)
           {
              System.out.println("matrix1["+i+"]["+j+"]");
              matrix1[i][j]=s.nextInt();
            }
         }
      }
      System.out.println("Enter the elements of the second matrix:");
      {
          for(i=0;i<row2;i++)
          {
            for(j=0;j<col2;j++)
            {
               System.out.println("matrix2["+i+"]["+j+"]");
               matrix2[i][j]=s.nextInt();
             }
           }
       }
      {
           for(i=0;i<row1;i++)
           {
              for(j=0;j<col2;j++)
              {
                product[i][j]=0;
                for(k=0;k<col1;k++)
                {
                  product[i][j]+=matrix1[i][j]*matrix2[k][j];
                 }
              }
            }
      }
     System.out.println("The product of the matrix is\n");
     {
        for(i=0;i<row1;i++)
        {
          for(j=0;j<col2;j++)
          {
            System.out.println(product[i][j]+" ");
           }
           System.out.println();
         }
      }
        s.close();
   }
  }
