import java.util.ArrayList;

public class Subtask extends Task {

    int status;

    public static final int NEW = 0;
    public static final int DONE = 1;
    public static final int IN_PROGRESS = 2;

    Epic epic;

    public Subtask(String name, String description, Epic epic){
        super(name, description);
        status = NEW;
        this.epic = epic;
    }

    public Subtask(String name, String description){
        super(name, description);
        status = NEW;
    }

    public void setEpic(Epic epic) {
        if(epic != null) {
            this.epic = epic;
        }
    }

    public Epic getEpic() {
        return epic;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public int getStatus(){
        return this.status;
    }
}
