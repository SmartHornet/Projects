import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        /*System.out.print("Ввод: ");

        Scanner console = new Scanner(System.in);
        String line = console.nextLine();

        System.out.println(line);*/

        String file = "calendar.xls";
        try (FileOutputStream out = new FileOutputStream(file)) {
            wb.write(out);
        }
    }
}