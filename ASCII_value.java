import java.util.*;
public class ASCII_value {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("Enter the character :");
        ch=sc.next().charAt(0);
        int ascii=ch;
        int casting=(int) ch;
        System.out.println("ASCII value of "+ch+ " is "+casting);
    }
}
