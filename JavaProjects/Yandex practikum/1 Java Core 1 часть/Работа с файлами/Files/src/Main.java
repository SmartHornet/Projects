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
        File newNameOldTestDir = new File(System.getProperty("java.class.path")+File.separator+"newNameOldTestDir");
        File oldTestTxtFile = new File(newNameOldTestDir, "oldTestTxtFile.txt");

        if(oldTestDir.exists()){
            System.out.println("Папка "+oldTestDir.getName()+" существует");
        }else {
            System.out.println("Папка "+oldTestDir.getName()+" не существует");
        }

        boolean dirIsCreated = oldTestDir.mkdir();
        if(dirIsCreated){
            System.out.println("Папка "+oldTestDir.getName()+" создана");
        }else{
            System.out.println("Папка "+oldTestDir.getName()+" не создана");
        }

        boolean dirIsRenamed = oldTestDir.renameTo(newNameOldTestDir);
        if(dirIsRenamed){
            System.out.println("Папка "+oldTestDir.getName()+" переименована");
        }else{
            System.out.println("Папка "+oldTestDir.getName()+" не переименована");
        }

        try (FileWriter fileWriter = new FileWriter(oldTestTxtFile)) {
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода! "+e.getMessage());
        }


        fileWriter


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