import java.util.ArrayList;

public class Task extends TaskPrototype {
    private ArrayList<Task> subTasks;
    private Task parentTask;
    int status;

    public static final int NEW = 0;
    public static final int DONE = 1;
    public static final int IN_PROGRESS = 2;

    Task(String name, String description){
        super(name, description);
        status = NEW;
    }
}
