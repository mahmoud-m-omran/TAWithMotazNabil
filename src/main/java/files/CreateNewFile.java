package files;

import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFile {
public static void main(String[] args){

        /*File file = new File("omran1.txt");
        try {
            if(file.createNewFile()){
                System.out.println("the file has been created in the following path : "+file.getAbsolutePath());
            }else{
                System.out.println("False");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    /*******************************/
    FileWriter writer= null;
    try {
        writer = new FileWriter("omran1.txt");
        writer.write("Good Morning Mr Omran");
        writer.close();
        /*we must close the writer in order to allow the writer
        to complete the process of writing in the file*/
    } catch (IOException e) {
        e.printStackTrace();
    }



}
   /*     try {
            File f = new File("DataFlair.txt");
            if (f.createNewFile()) {
                System.out.println("New File created!");
            } else {
                System.out.println("The file already exists.");
            }
        } catch(
    IOException e) {
            e.printStackTrace();
        }
    }*/

}
