import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите сумму перевода в рублях:");
        String input = scanner.nextLine();
        double amount = 0;

        try {

            amount = Double.parseDouble(input.trim());
            if (TransactionValidator.isValidAmount(amount))
                System.out.println("Спасибо! Ваш перевод на сумму " + amount + " р. успешно выполнен.");
        }
        catch (NumberFormatException ex){
            System.out.println("Введено не число или неверный формат!");
        }



    }
}