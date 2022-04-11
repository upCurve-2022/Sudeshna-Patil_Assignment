import java.util.*;
public class IsEmpty {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.println("Enter the String :");
        str=sc.nextLine();
        if(str.isEmpty()){
            System.out.println("String is Empty");
        }
        else {
            System.out.println("String is not Empty");
        }
    }
}
