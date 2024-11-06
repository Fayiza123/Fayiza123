//pgm that implements QuickSort algorithm for sorting a list of names in ascending order
//Fayiza_28
import java.util.Scanner;
class QuickSort
{
static void quickSort(String[]names,int low,int high)
{
 if(low<high)
 {
   int pi=partition(names,low,high);
   quickSort(names,low,pi-1);
   quickSort(names,pi+1,high);
 }
}
static int partition(String[]names,int low,int high)
{
 String pivot=names[high];
 int i=low-1;
 for(int j=low;j<high;j++)
 {
   if(names[j].compareTo(pivot)<0)
   {
     i++;
     String temp=names[i];
     names[i]=names[j];
     names[j]=temp;
   }
 }
 String temp=names[i+1];
 names[i+1]=names[high];
 names[high]=temp;
 return i+1;
 }
 public static void main(String args[])
 {
   Scanner scanner=new Scanner(System.in);
   System.out.println("Enter the number of names:");
   int n=scanner.nextInt();
   scanner.nextLine();
   String[]names=new String[n];
   System.out.println("Enter the names:");
   for(int i=0;i<n;i++)
   {
     names[i]=scanner.nextLine();
   }
   quickSort(names,0,n-1);
   System.out.println("Sorted names in ascending order:");
   for(String name:names)
   {
     System.out.println(name);
   }
   scanner.close();
  }
}


