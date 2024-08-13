//FAYIZA K H
//S3 CSE(AI)
//Rollno:28
import java.util.*;
class transpose
{
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        int matrix[][]=new int[50][50];
        int transposematrix[][]=new int[50][50];
        int i,j;
        System.out.println("Enter the number of rows and columns:");
        int row=S.nextInt();
        int col=S.nextInt();
        System.out.println("Enter the matrix elements:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
               System.out.println("matrix["+i+"]["+j+"]:");
               matrix[i][j]=S.nextInt();
            }
        }
        for(i=0;i<row;i++)
        {
           for(j=0;j<col;j++)
           {
              transposematrix[j][i]=matrix[i][j];
           }
        }
        System.out.println("The transpose is:");
        {
           for(i=0;i<col;i++)
           {
               for(j=0;j<row;j++)
               {
                  System.out.println(transposematrix[i][j]+"");
               }
               System.out.println();
           }
        }
        S.close();
    }
}
                      
        
