import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String imageFName = "image.jpg";
        BufferedImage image = null;
        try(FileInputStream fin = new FileInputStream(imageFName);){
            image = ImageIO.read(fin);
        } catch (IOException exc){
            System.out.print("Ошибка ввода-вывода: " + exc);
        }

        System.out.println("Height: " + image.getHeight());
        System.out.println("Width: " + image.getWidth());

        Color color = new Color(image.getRGB(320,120));
        System.out.println("R: " + color.getRed());
        System.out.println("G: " + color.getGreen());
        System.out.println("B: " + color.getBlue());

        //System.out.print("Ввод: ");

        //Scanner console = new Scanner(System.in);

        /*String fName = "file.data";

        try(FileOutputStream fout = new FileOutputStream(fName);){
            for(int i = 0; i<10; i++){
                fout.write(i);
            }
        } catch (IOException exc){
            System.out.print("Ошибка ввода-вывода: " + exc);
        }

        try(FileInputStream fin = new FileInputStream(fName);){
            do{
                b = fin.read();
                if(b != -1) {
                    System.out.println(b);
                }
            }while(b != -1);
        } catch (IOException exc){
            System.out.print("Ошибка ввода-вывода: " + exc);
        }*/

        //String line = console.nextLine();

        //System.out.println(line);
    }
}