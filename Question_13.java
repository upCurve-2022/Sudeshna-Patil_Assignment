import java.util.*;
public class Question_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit, i,j, number;
        System.out.println("Enter the limit for sequence : ");
        limit=sc.nextInt();
        for(i=1;i<=limit;i++){
            number=1;
            for( j=1;j<=i;j++) {
                number = number * i;
            }
            System.out.print(number+"  ");
        }

    }
}
