//The property of the perfect square number is that it ends only with 0, 1, 4, 6, 9, and 25.
// we can also use sqrt() method.
import java.util.*;
public class Perfect_Square {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int ans,square;
        System.out.println("Enter the Square :");
        square=sc.nextInt();
        ans=(int)Math.sqrt(square);
        if(ans*ans==square){
            System.out.println(square+" is perfect square ");
        }else{
            System.out.println(square+" is not perfect square ");
        }
    }
}
