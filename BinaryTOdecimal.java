import java.util.*;
public class BinaryTOdecimal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int index=0,decimal=0;

        int n=0;
        System.out.println("Enter number :");
        decimal= sc.nextInt();
        while(true){
            if(index==0){
                break;
            }else{
              int temp=index%10;
              decimal+=temp*Math.pow(2,n);
              index=index/10;
              n++;
            }
        }

    }
}
