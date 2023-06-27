public class MountainHare {

    private int age;
    private double weight;
    private double jumpLength;
    private static HareColor color;

    MountainHare(int age, double weight, double jumpLength){
        this.age = age;
        this.jumpLength = jumpLength;
        this.weight = weight;
    }

    public static void setColor(HareColor clr){
        color = clr;
    }

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}