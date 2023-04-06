import java.util.ArrayList;
import java.util.HashMap;

public class TaskManager {
    int idCounter;
    private HashMap<Integer, Task> tasks;

    public static final int NEW = 0;
    public static final int DONE = 1;
    public static final int IN_PROGRESS = 2;


    public void createTask(String name, String description){
        Task task = new Task(name, description);
    }

    TaskManager(){
        idCounter = 0;
        tasks = new HashMap<>();
    }
}
