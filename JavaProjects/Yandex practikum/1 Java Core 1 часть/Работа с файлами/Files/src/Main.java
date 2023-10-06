import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args)  {

        //Старый интерфейс
        File oldTestDir = new File(System.getProperty("java.class.path")+File.separator+"oldTestDir");
        File oldTestTxtFile = new File(oldTestDir, "oldTestTxtFile.txt");

        boolean dirIsCreated = oldTestDir.mkdir();
        if(dirIsCreated){
            System.out.println("Папка "+oldTestDir.getName()+" создана");
        }

        try (FileWriter fileWriter = new FileWriter(oldTestTxtFile)) {


        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода! "+e.getMessage());
        }

        //oldTestTxtFile.





        /*try{
            Path testTxtFile  = Files.createFile(Paths.get(System.getProperty("java.class.path"), "testFile.txt"));

        }catch (FileAlreadyExistsException e){

            System.out.println("Файл "+e.getMessage()+" уже существует!");

        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода! "+e.getMessage());
        }*/




        //System.out.println(testFile);
    }
}