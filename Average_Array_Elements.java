import java.util.*;
public class Average_Array_Elements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size,avg=0,sum=0;
        System.out.println("Enter the number of elements in array :");
        size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Element "+i+ " :");
            array[i]= sc.nextInt();
        }
        for(int i=0;i<size;i++){
           sum+=array[i];
        }
        avg=sum/size;
        System.out.println("Average of "+size+" elements of array is "+avg);


    }
}
