import java.util.List;

public class Forest {
    private List<MountainHare> hares;
    private static Season season;

    Forest(List<MountainHare> hares){
        this.hares = hares;
    }

    public static void setSeason(Season newSeason){
        season = newSeason;
        if(newSeason == Season.WINTER)MountainHare.setColor(HareColor.WHITE);
            else MountainHare.setColor(HareColor.GREYGINGER);
    }

    public void printHares(){
        for(MountainHare hare: hares){
            System.out.println(hare);
        }
    }

    // объявите недостающие переменные и добавьте конструктор

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    // добавьте метод printHares()

}