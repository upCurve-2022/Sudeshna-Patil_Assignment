import java.util.*;

public class LargestANDSecondLargest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3,largest=0,Second_Largest=0;
        System.out.println("Enter number 1 : ");
        num1=sc.nextInt();
        System.out.println("Enter number 2 : ");
        num2=sc.nextInt();
        System.out.println("Enter number 3 : ");
        num3=sc.nextInt();
        if(num1>num2){
            largest=num1;
            Second_Largest=num3;
        }
        if(num3>num1){
            largest=num3;
           Second_Largest=num2;

        }
        if(num2>num3){
            largest=num2;
            Second_Largest=num1;
        }
        System.out.println("Largest number : " +largest);
        System.out.println("Second Largest :" +Second_Largest);
    }
}
