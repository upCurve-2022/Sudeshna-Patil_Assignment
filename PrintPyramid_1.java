import java.util.*;
public class PrintPyramid_1 {
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int length,i,j;
      System.out.println("Enter the Length of pyramid :");
      length=sc.nextInt();
       for(i=0;i<length;i++)
       {
           for(j=0;j<=i;j++)
           {
               System.out.print("* ");
           }

           System.out.println();
       }

   }
}
