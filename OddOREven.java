import java.util.*;

public class OddOREven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.print("Enter number : " );
        number=sc.nextInt();
        if(number>0){
            System.out.println(number +"  is  even number");
        }else{
            System.out.println(number +"  is odd number");
        }
    }
}
