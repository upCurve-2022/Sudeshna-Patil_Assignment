import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int length,i=0,j=1,c;
        System.out.println("Enter the limit :");
        length=sc.nextInt();
        System.out.print(i + " " +j);

        for(int k=2;k<length;++k){
           c=i+j;
            System.out.print(" " +c);
           i=j;
           j=c;

        }
    }
}
