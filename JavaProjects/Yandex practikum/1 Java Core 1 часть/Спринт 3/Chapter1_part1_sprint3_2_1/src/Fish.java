public class Fish extends Pet{

    Fish() {
        super(0);
    }

    @Override
    public void giveVoice() {
        System.out.println("Буль буль!");
    }
}
