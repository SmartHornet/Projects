import java.util.HashMap;

public class TaskManager {
    int idCounter;
    private HashMap<Integer, Subtask> tasks;




    public void createTask(String name, String description){
        Subtask task = new Subtask(name, description);
        tasks.put(idCounter, task);
        idCounter++;
    }

    TaskManager(){
        idCounter = 0;
        tasks = new HashMap<Integer, Subtask>();
    }
}
