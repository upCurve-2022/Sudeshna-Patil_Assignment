import java.util.*;
public class Power {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number,power,i,ans=1;
        System.out.println("Enter the number :");
        number=sc.nextInt();
        System.out.println("Enter power :");
        power=sc.nextInt();
        for(i=1;i<=power;i++){
            ans=ans*number;
        }
        System.out.println("Answer is " +ans);
    }
}
