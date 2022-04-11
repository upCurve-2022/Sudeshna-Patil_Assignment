import java.io.*;
public class File_create {
    public static void main(String[] args){
         try{
           File myfile =new File("E:\\FileHandling\\File.txt");
             if(myfile.createNewFile()){
                 System.out.println("File Created :"+myfile.getName());

             }else{
                 System.out.println("File already exists");
             }
         }catch(IOException e){
             System.out.println("An error occured");
         }
    }
}
