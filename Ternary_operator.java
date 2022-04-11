// Ternary operator -Java ternary operator is the only conditional operator that takes three operands.
//We can use the ternary operator in place of if-else conditions or even switch conditions using
// nested ternary operators.

import java.util.*;
public class Ternary_operator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a ,b,d,c;
        System.out.println("Enter number 1 : ");
        a= sc.nextInt();
        System.out.println("Enter number 2 : ");
        b= sc.nextInt();
        System.out.println("Enter number 3 : ");
        c=sc.nextInt();
        d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("Largest Number : " +d);
    }
}
