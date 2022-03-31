import java.util.*;

public class Armstrong_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number,i,reverse=0,ans=0,temp=0;
        System.out.print("Enter number : ");
        number=sc.nextInt();
        System.out.println();
        while(number!=0){
           int remainder=number%10;

           number=number/10;
           temp=temp+reverse*reverse*reverse;

        }
        if(temp==number){
            System.out.println("Giver number is armstrong number ");
        }
        else{
            System.out.println("Giver number is not a armstrong number ");
        }
    }
}
