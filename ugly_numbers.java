import java.util.*;
public class ugly_numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter the number : ");
        number=sc.nextInt();
        
        if(number%2==0 || number%3==0 || number%5==0){
            System.out.println(number+" is ugly number");

        }else{
            System.out.println(number+" is not a ugly number");
        }
    }
}
