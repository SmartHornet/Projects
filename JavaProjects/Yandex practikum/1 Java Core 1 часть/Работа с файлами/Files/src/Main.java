import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static <e> void main(String[] args) {


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

        //бинарные файлы
        //Path newTestDir = Files.createDirectory(Paths.get(System.getProperty("java.class.path"),"newTestDir"));
        Path newTestDir;
        newTestDir = Path.of(System.getProperty("java.class.path"),"newTestDir");
        try{
            Files.createDirectory(newTestDir);

        } catch (IOException e){
            System.out.println("Ошибка создания папки "+newTestDir.toString()+"\n"+e.getMessage());
        }

        if(Files.exists(newTestDir)){
            System.out.println("Папка "+newTestDir.toString()+" существует");
        }else{
            System.out.println("Папка "+newTestDir.toString()+" не существует");
        }


        Path newTestDataFile = Path.of(newTestDir.toString(),"newTestDataFile.dat");
        try(DataOutputStream dataOutputStream = new DataOutputStream(Files.newOutputStream(newTestDataFile))){

            dataOutputStream.writeInt(47869);
            dataOutputStream.writeDouble(12.56);
            String str = "Мяка";
            dataOutputStream.write(str.getBytes(StandardCharsets.UTF_8));

            //System.out.printf(Integer.toHexString(2));

        }catch (IOException e){
            System.out.println("Ошибка открытия потока "+e.getMessage());
        }

        try(DataInputStream dataInputStream = new DataInputStream(Files.newInputStream(newTestDataFile))){

            int i = dataInputStream.readInt();
            double d =  dataInputStream.readDouble();

            byte[] byteArr = new byte[8];
            dataInputStream.read(byteArr);

            String str = new String(byteArr,StandardCharsets.UTF_8);

            System.out.println("Считано из файла "+newTestDataFile.getFileName()+":");
            System.out.println(i);
            System.out.println(d);
            System.out.println(str);

        }catch (IOException e){
            System.out.println("Ошибка открытия потока "+e.getMessage());
        }

        System.out.println("Нажмите ввод для удаления файлов");
        try {
            System.in.read();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода! "+e.getMessage());
        }

        if(oldTestTxtFile.exists()) {
            String fn = oldTestTxtFile.getName();
            if(oldTestTxtFile.delete()){
                System.out.println("Файл "+fn+" удален");
            }
        }

        if(oldTestDir.exists()) {
            String fn = oldTestDir.getName();
            if(oldTestDir.delete()){
                System.out.println("Файл "+fn+" удален");
            }
        }

        if(newNameOldTestDir.exists()) {
            String fn = newNameOldTestDir.getName();
            if(newNameOldTestDir.delete()){
                System.out.println("Файл "+fn+" удален");
            }
        }

        String fn = newTestDataFile.toString();
        try {
            if(Files.deleteIfExists(newTestDataFile)){
                System.out.println("Файл "+fn+" удален");
            }
        } catch (IOException e) {
            System.out.println("Ошибка удаления! "+e.getMessage());
        }


        fn = newTestDir.toString();
        try {
            if(Files.deleteIfExists(newTestDir)){
                System.out.println("Файл "+fn+" удален");
            }
        } catch (IOException e) {
            System.out.println("Ошибка удаления! "+e.getMessage());
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