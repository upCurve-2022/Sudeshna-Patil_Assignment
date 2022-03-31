import java.util.*;

public class Question_11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int limit,number=2;
        System.out.println("Enter the limit for sequence : ");
        limit=sc.nextInt();
        for(int i=2;i<=limit;i+=2){
            number=i*i;

            System.out.print(number +"  ");
        }

    }
}
