import java.util.ArrayList;

public class Task extends TaskPrototype {
    ArrayList<Task> subTasks;
    Task parentTask;

    Task(String name, String description){
        super(name, description);
    }
}
