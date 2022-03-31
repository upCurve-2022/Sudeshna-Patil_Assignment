import java.util.*;

public class Question_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit, i, j, number;
        System.out.println("Enter the limit for sequence : ");
        limit = sc.nextInt();
        for(i=1;i<=limit;i++){
            number=i*i;
            System.out.println(number + "  ");
        }
    }
}
