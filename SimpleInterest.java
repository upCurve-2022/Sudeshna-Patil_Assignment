import java.util.*;
public class SimpleInterest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float SI,P,R,T;
        System.out.println("Enter the principal : ");
        P=sc.nextFloat();
        System.out.println("Enter the Rate of Interest : ");
        R=sc.nextFloat();
        System.out.println("Enter time period : ");
        T=sc.nextFloat();

        SI=(P*R*T)/100;
        System.out.println("Simple interest is : " +SI);

    }
}
