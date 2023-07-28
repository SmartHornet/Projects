public class Dog extends Pet{
    @Override
    public void giveVoice() {
        System.out.println("Гав!");
    }

    public void bringStick(){
        System.out.println("Принес палочку, как хороший мальчик");
    }

    Dog(){
        super(4);
    }
}
