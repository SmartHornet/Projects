import java.util.ArrayList;
import java.util.HashMap;

public class TaskManager {
    private HashMap<Integer, Task> tasks;
    private HashMap<Integer, Subtask> subTasks;
    private HashMap<Integer,Epic> epics;


    public void createTask(String name, String description){
        tasks.put(generateID(),new Task(name, description));
    }

    public boolean addTask(Task task){
        if (task != null){
            tasks.put(generateID(),task);
            return true;
        } else return false;
    }

    public boolean updateTask(Task task, int id){
        if(!tasks.containsKey(id)) return false;
        if (task != null){
            tasks.replace(id,task);
            return true;
        } else return false;
    }

    public Task getTask(int id){
        return tasks.get(id);
    }

    public HashMap<Integer, Task> getTasks(){
        return new HashMap<Integer, Task>(tasks);
    }

    public void removeAll(){

        tasks.clear();
    }

    TaskManager(){
        tasks = new HashMap<>();
        subTasks = new HashMap<>();
        epics = new HashMap<>();
    }

    private int generateID(){
        int id;
        for (id = 0; id < Integer.MAX_VALUE && (tasks.containsKey(id)
                || subTasks.containsKey(id) || epics.containsKey(id)); id++);
        return id;
    }
}
