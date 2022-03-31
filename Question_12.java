import java.util.*;
public class Question_12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int limit,i,number;
        System.out.println("Enter the limit for sequence : ");
        limit=sc.nextInt();
        for(i=1;i<=limit;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }else{
                System.out.print(-i+" ");
            }
        }
    }
}
