import java.util.*;
public class NumberINWords {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int i,choice=0;
      String number=new String();
      System.out.println("Enter the number :");
      number=sc.nextLine();
      for(i=0;i<number.length();i++) {
          switch (choice) {

              case 1:
                  if(number.charAt(i)==1)
                  System.out.println("One");
                  break;
              case 2:
                  if(number.charAt(i)==2)
                  System.out.println("Two");
                  break;
              case 3:
                  if(number.charAt(i)==3)
                  System.out.println("Three");
                  break;
              case 4:
                  if(number.charAt(i)==4)
                  System.out.println("Four");
                  break;
              case 5:
                  if(number.equals(5))
                  System.out.println("Five");
                  break;
              case 6:
                  if(number.equals(6))
                  System.out.println("Six");
                  break;
              case 7:
                  if(number.equals(7))
                  System.out.println("Seven");
                  break;
              case 8:
                  if(number.equals(8))
                  System.out.println("Eight");
                  break;
              case 9:
                  if(number.equals(9))
                  System.out.println("Nine");
                  break;


          }

      }

    }
}
