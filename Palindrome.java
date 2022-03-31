import java.util.*;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=new String();
        String result="";
        char ch;
        System.out.println("Enter the String :");
        str=sc.nextLine();
        for(int i=str.length()-1;i>=0;--i) {


            result = str.charAt(i) + result;

        }
            if (str.equals(result)) {
                System.out.println("String is palindrome ");
            } else {
                System.out.println("String is not palindrome ");
            }

    }
}
