public class Main {
            public static void main(String[] args) {
            Cat cat = new Cat();
            cat.catchMouse();
            cat.giveVoice();
            System.out.println("У кошки " + cat.getPawsCount() + " лапок.");

            Dog dog = new Dog();
            dog.bringStick();
            dog.play();

            Hamster hamster = new Hamster();
            hamster.hideFood();
            hamster.sleep();

            Fish fish = new Fish();
            fish.sleep();

            Spider spider = new Spider();
            System.out.println("У паука " + spider.getPawsCount() + " лапок.");
        }
    }