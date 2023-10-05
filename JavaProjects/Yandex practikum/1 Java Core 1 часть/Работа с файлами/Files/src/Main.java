import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {


        //Path TestDir = Paths.get(System.getProperty("java.class.path"));
         //testTxtFile = ;


        /*for (Path i: testFile){
            System.out.println(i);
        }*/
    try{
        Path testTxtFile  = Files.createFile(Paths.get(System.getProperty("java.class.path"), "testFile.txt"));

    }catch (FileAlreadyExistsException e){

        System.out.println("Файл "+e.getMessage()+" уже существует!");

    }catch (IOException e){
        System.out.println("Ошибка ввода-вывода! "+e.getMessage());
    }




        //System.out.println(testFile);
    }
}