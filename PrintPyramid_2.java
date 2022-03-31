import java.util.*;

public class PrintPyramid_2 {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int length,i,j;
     System.out.println("Enter the Length of pyramid :");
     length=sc.nextInt();
     for(i=0;i<length;i++){
         for(j=length-i;j>1;j--){
             System.out.print(" ");
         }
         for(int k=0;k<=i;k++){
             System.out.print("* ");
         }
         System.out.println();
     }




    }
}
