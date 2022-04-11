import java.util.*;
public class Volume_OF_Cylinder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double volume,radius,height;
        System.out.println("Enter the radius :");
        radius=sc.nextDouble();
        System.out.println("Enter the height :");
        height=sc.nextDouble();
        volume=3.14*radius*radius*height;
        System.out.println(volume);
    }
}

