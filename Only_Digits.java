import java.util.*;
public class Only_Digits {
    public static boolean onlydigits(String str){

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' || str.charAt(i)<='z'){
                return true;
            }else{
              return false;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.println("Enter the String :");
        str=sc.nextLine();
        System.out.println(onlydigits(str));
    }
}
