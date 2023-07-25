// Допишите реализацию класса Smartphone
public class Smartphone extends MobilePhone{

    public Smartphone(String number) {
        super(number);
    }

    public final void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

    public void makeCall(String targetNumber, String appName) {
        System.out.println("Звоним с номера " + getNumber()+" через приложение "+appName+" на номер "+targetNumber);
    }
}