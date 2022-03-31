import java.util.*;
public class SumOFOddANDEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=10,sum_Even=0,Sum_odd=0,i=0,j=1;
        while(i<=n){
            sum_Even=sum_Even+i;
            i=i+2;
        }
        System.out.println("Sum of Even numbers is : "+sum_Even);

        while(j<n){
           Sum_odd=Sum_odd+j;
            j=j+2;
        }

        System.out.println("Sum of Odd numbers is :"+Sum_odd);

    }
}
