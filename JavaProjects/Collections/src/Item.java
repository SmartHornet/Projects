public class Item {
    private static int counter;
    private int number;
    private String str;


    Item(String str){
        counter++;
        number = counter;
        this.str = str;
    }

    @Override
    public String toString() {
        return "Item-"+Integer.toString(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
