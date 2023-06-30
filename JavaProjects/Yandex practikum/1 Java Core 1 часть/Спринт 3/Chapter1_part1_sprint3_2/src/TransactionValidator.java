public class TransactionValidator {

    // объявите константы
    public static final double MIN_AMOUNT = 1;
    public static final double MAX_AMOUNT = 5000;

    static boolean isValidAmount(double amount){
        if(amount < MIN_AMOUNT) {
            System.out.println("Минимальная сумма перевода: " +MIN_AMOUNT+ " р. Попробуйте ещё раз!");
            return false;
        }
        if(amount > MAX_AMOUNT) {
            System.out.println("Максимальная сумма перевода: " +MAX_AMOUNT+ " р. Попробуйте ещё раз!");
            return false;
        }
        return true;
    }
}
