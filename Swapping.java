import java.util.*;

public class Swapping {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Swapping 2 numbers ");
            System.out.println("2. Swapping 3 numbers ");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    int number_1,Number_2,Answer,temp;
                    System.out.println("Enter number 1 : ");
                    number_1=sc.nextInt();
                    System.out.println("Enter number 2 : ");
                    Number_2=sc.nextInt();
                    System.out.println("Before Swapping : "+number_1 +" , "+Number_2);
                    temp=number_1;
                    number_1=Number_2;
                    Number_2=temp;
                    System.out.println("After Swapping : " +number_1 +" , "+Number_2);
                    break;

                case 2:
                    int Number_1,number_2,Number_3,answer,Temp;
                    System.out.println("Enter number 1 : ");
                    Number_1=sc.nextInt();
                    System.out.println("Enter number 2 : ");
                    number_2=sc.nextInt();
                    System.out.println("Enter number 3 : ");
                    Number_3= sc.nextInt();
                    System.out.println("Before Swapping : "+Number_1 +" , "+number_2+" ," +Number_3);
                    Temp=Number_1;
                    Number_1=number_2;
                    number_2=Temp;

                    Temp=number_2;
                    number_2=Number_3;
                    Number_3=Temp;
                    System.out.println("After Swapping : " +Number_1 +" , "+number_2+" , "+Number_3);
                    break;

                default:
                    System.out.println("Enter Proper choice : ");


            }
        }while(choice!=0);
    }
}
