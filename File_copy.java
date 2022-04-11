import java.io.*;
public class File_copy {
    public static void main(String[] args){
        try{
            File newfile=new File("E:\\FileHandling\\File3.txt");
            newfile.createNewFile();
            System.out.println("File created");
        }catch(IOException e){
            System.out.println("An error has occured");
        }
    }
}
