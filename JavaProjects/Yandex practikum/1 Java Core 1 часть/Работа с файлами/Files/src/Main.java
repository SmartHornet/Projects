import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static <e> void main(String[] args)  {


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


        //Байтовые потоки, текстовые файлы
        FileOutputStream file = null;
        try {
            file = new FileOutputStream(oldTestTxtFile);

            if(file != null){
                file.write("Кот\n".getBytes());
            }


        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода! "+e.getMessage());
        }finally {
            try {
                if(file != null) {
                    file.flush();
                    file.close();
                }
            }catch (IOException e){
                System.out.println("Ошибка закрытия файла! "+e.getMessage());
            }
        }

        try(FileWriter fw = new FileWriter(oldTestTxtFile,true)) {

            fw.write("Сема");

        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода! "+e.getMessage());
        }

        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(oldTestTxtFile)))){
            System.out.println("Содержимое файла "+oldTestTxtFile.getName()+ ":");
            String str;
            do{
                str = br.readLine();
                if(str != null) System.out.println(str);
            }while (str != null);

        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден! " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода! " + e.getMessage());
        }

        //Новый интерфейс
        Path newTestDataFilePath = Paths.get(newTestDir.toString(),"newTestDataFile.dat");

        //бинарные файлы
        Path newTestDir = Files.createDirectory(Paths.get(System.getProperty("java.class.path"),"newTestDir"));


        try(Path newTestDir2 = Files.createDirectory(newTestDir)){

        }catch (IOException e){
            System.out.println("Ошибка создания папки "+newTestDir.toString()+"\n"+e.getMessage());
        }



        /*char[] pass;

        Console console = System.console();

        if(console != null){
            System.out.print("pass: ");
            pass = console.readPassword();
            System.out.println(pass);
        }else{
            System.out.print("console = null");
        }*/


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