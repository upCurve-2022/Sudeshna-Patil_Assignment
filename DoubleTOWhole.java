import java.util.*;

public class DoubleTOWhole {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double number;
        System.out.println("Enter number : ");
        number=sc.nextDouble();
        String s1=String.valueOf(number);
        int index=s1.indexOf(".");
        System.out.println(s1.substring(0,index)+"  "+s1.substring(index+1));


    }
}
