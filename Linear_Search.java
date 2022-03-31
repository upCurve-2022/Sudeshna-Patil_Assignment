import java.util.*;
public class Linear_Search {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the size of array :");
        n=sc.nextInt();
        int[] array=new int[n];
        for(i=0;i<n;i++){
            System.out.print("Enter "+i+ " element :");
            array[i]=sc.nextInt();
        }
        for(i=0;i<n;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the number that you want to search :");
        int number=sc.nextInt();
        for(i=0;i<n;i++){
            if(array[i]==number){
                System.out.println(number +" exits in array at index "+i);
                break;
            }

        }
        if(i==n){
            System.out.println(number+ " does not exits");
        }
    }
}
