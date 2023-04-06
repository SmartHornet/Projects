import java.util.ArrayList;
import java.util.HashMap;

public class TaskManager {
    int idCounter;
    private HashMap<Integer, Task> tasks;




    public void createTask(String name, String description){
        Task task = new Task(name, description);
        tasks.put(idCounter, task);
        idCounter++;
    }

    TaskManager(){
        idCounter = 0;
        tasks = new HashMap<Integer, Task>();
    }
}
