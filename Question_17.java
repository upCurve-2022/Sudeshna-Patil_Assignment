import java.util.*;
public class Question_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit1,limit2, i, j, number;
        System.out.println("Enter the limit1  : ");
        limit1 = sc.nextInt();
        System.out.println("Enter the limit2 : ");
        limit2 = sc.nextInt();
        for(i=limit1;i<=limit2;i++) {
            for (j = 1; j <= limit2; j++) {
                if (i % j != 0) {

                }
                System.out.println(i);
            }
        }
    }
}
