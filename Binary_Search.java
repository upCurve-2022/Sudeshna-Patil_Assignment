import java.util.*;

public class Binary_Search {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num,i,temp=0,mid,element;
        System.out.println("Enter the number of elements that you want to enter in array : ");
        num=sc.nextInt();
        int[] array=new int [num];
        for( i=0;i<num;i++){
            System.out.println("Enter "+ i +" Element : ");
            array[i]=sc.nextInt();

        }
        //if array not sorted then we need to sort it
        for(i=0;i<num;i++) {
            for (int j = i+1; j < num; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println("Sorted Array :"+array[i]);
        }


        mid=num/2;
        System.out.println("Enter the element that you want to search :");
        element = sc.nextInt();

        if(array[mid]>element) {
            for (i = 0; i < mid; i++) {
                if (element == array[i]) {
                    System.out.println(array[i] +" element present at index "+i);
                }
            }
            if(i==mid){
                System.out.println("Element does not exist");
            }
        }else{
            for(i=mid;i<num;i++){
                if (element == array[i]) {
                    System.out.println(array[i]+" element present at index "+i);
                }
            }
            if(i==num){
                System.out.println("Element does not exist");
            }
        }

    }
}

