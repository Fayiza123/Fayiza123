/FAYIZA K H
//S3 CSE(AI)
//Rollno:28
import java.util.*;
class reverse
{
    public static void main(String args[])
    {
        String st,rev="";
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter the string:");
        st=S1.nextLine();
        st=st.toLowerCase();
        int length=st.length();
        for(int i=length-1;i>=0;i--)
        {
            rev+=st.charAt(i);
        }
        System.out.println("The reversed string is "+rev);
        S1.close();
     }
}
