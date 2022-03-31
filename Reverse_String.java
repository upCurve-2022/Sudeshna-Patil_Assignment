import java.util.*;

public class Reverse_String {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j;
        String str=new String();
        String result=" ";
        char ch,ch2;
        System.out.println("Enter the String : ");
        str=sc.nextLine();
       for(i=0;i<str.length();i++) {

               ch = str.charAt(i);
              result=ch+result;

       }
        System.out.println(result);
       }

}
