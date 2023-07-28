import java.util.List;

public class Calculator {

    private Calculator() {}

    public static double calculate(List<MediaItem> mediaItems) {
        double minutes = 0;
        
        for (MediaItem item: mediaItems){
            if(item instanceof Movie){
                minutes += item.getRuntime();
            } else if (item instanceof Series) {
                minutes = minutes + item.getRuntime() * ((Series) item).getSeriesCount();
            }
        }
        return  minutes/(60*24);
    }
}