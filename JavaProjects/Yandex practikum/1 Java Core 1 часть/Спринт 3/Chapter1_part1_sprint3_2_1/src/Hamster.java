public class Hamster extends  Pet{

    Hamster() {
        super(4);
    }

    @Override
    public void giveVoice() {
        System.out.println("Пииииииииии!");
    }

    public void hideFood(){
        System.out.println("Вся еда в щечках!");
    }
}
