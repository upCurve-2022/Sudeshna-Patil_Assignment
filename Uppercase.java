import java.util.*;
public class Uppercase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=new String();
        String ans="";
        System.out.print("Enter the String :");
        str=sc.nextLine();
        System.out.println();
        ans=str.toUpperCase();
        System.out.println(ans);

    }
}
