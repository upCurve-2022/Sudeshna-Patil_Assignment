import java.io.*;
public class File_Write_Data {
    public static void main(String[] args){
        try {
            FileWriter myfile = new FileWriter("File.txt");
            myfile.write("Harsha is very good dancer !");
            myfile.close();
            System.out.println("Successfuly written");
        }catch(IOException e){
            System.out.println("An error ocurred");
            e.printStackTrace();
        }
    }
}
