package section.Topics.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ExceptionDemo {
    public static void show() {
        FileReader reader = null;
        try {
             reader = new FileReader("file.txt");
            var value = reader.read();
        } catch (FileNotFoundException ex) {//CATCHING EXCEPTION
            System.out.println("File does not found");
        }
        catch (IOException ex){//MULTI CATCHING
            System.out.println("Could not read data");
        }
        finally{//FINALLY BLoCK
            if(reader!=null)
                try {
                    reader.close();
                }
            catch (IOException ex){
                ex.printStackTrace();
            }
        }

    }
    public static void show2(){//TRY WITH RESOURCE STATEMENT
        try(var reader = new FileReader("file.txt")){

        }catch (IOException ex){
            System.out.println("NOT FOUND");
        }
    }
}

