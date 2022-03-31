import java.util.*;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number,ans=0,remainder;
        System.out.println("Enter the number : ");
        number = sc.nextInt();
        while(number!=0) {

            remainder = number % 10;
            ans = ans * 10 + remainder;
            number = number / 10;
        }
        System.out.println("Reverse number is : "+ans);
    }
}
