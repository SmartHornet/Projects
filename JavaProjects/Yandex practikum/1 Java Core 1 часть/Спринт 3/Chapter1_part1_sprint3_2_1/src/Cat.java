public class Cat extends Pet{

    @Override
    public void giveVoice() {
        System.out.println("Мяу!");
    }

    public void catchMouse(){
        System.out.println("Поймала мышь!");
    }

    Cat(){
        super(4);
    }
}
