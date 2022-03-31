import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number,i,ans=1;
        System.out.println("Enter the number :");
        number=sc.nextInt();

        for(i=1;i<=number;i++){
            ans=ans*i;
        }
        System.out.println("Factorial : "+ans);
    }
}
