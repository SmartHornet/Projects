import java.util.ArrayList;

public class Subtask extends Task {

    int status;

    public static final int NEW = 0;
    public static final int DONE = 1;
    public static final int IN_PROGRESS = 2;





    Subtask(String name, String description){
        super(name, description);
        status = NEW;
    }
}
