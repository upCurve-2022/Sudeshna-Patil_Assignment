import java.util.*;
public class Exception_Handling extends Exception {
    Exception_Handling() {
        super("Delivery Available in your area");
    }
    Exception_Handling(String msg){
        super(msg);
    }

}
class delivery{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int zipcode;
        System.out.println("Enter the zip code :");
        zipcode=sc.nextInt();
        try {
            if (zipcode != 123 || zipcode != 456 || zipcode != 789) {

                throw new Exception_Handling();
            }
            else{
                System.out.println("Delivery is not Available in your area");
            }
        }catch(Exception_Handling e){
            e.printStackTrace();
        }
    }
}
