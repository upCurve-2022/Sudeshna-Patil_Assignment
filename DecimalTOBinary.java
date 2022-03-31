import java.util.*;
public class DecimalTOBinary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int index=0,decimal;

        int[] number=new int[30];
        System.out.println("Enter number :");
        decimal= sc.nextInt();
        while(decimal>0){
            number[index++]=decimal%2;
            decimal=decimal/2;
        }
      for(int i=index-1;i>=0;i--){
          System.out.print(number[i]);
      }
        System.out.println();
    }
}
