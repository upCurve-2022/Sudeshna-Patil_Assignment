import java.util.*;
public class Duplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.println("Enter the String :");
        str=sc.nextLine();
        char ch;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++) {
                if (str.charAt(i) == str.charAt(j)) {
                   ch=str.charAt(j);
                }
               
            }
        }

    }
}
