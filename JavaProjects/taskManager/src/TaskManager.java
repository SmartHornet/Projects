import java.util.ArrayList;
import java.util.HashMap;

public class TaskManager {
    private HashMap<Integer, Task> allTasks;
    private ArrayList<Task> tasks;
    private ArrayList<Subtask> subTasks;
    private ArrayList<Epic> epics;


    public void createTask(String name, String description){
        Task task = new Task(name, description);
        tasks.add(task);
        allTasks.put(generateID(),task);
    }

    public boolean addTask(Task task){
        if (task != null){
            tasks.add(task);
            allTasks.put(generateID(),task);
            return true;
        } else return false;

    }

    public boolean updateTask(Task task, int id){
        if(!allTasks.containsKey(id)) return false;
        if (task != null){
            tasks.remove(allTasks.replace(id,task));
            tasks.add(task);
            return true;
        } else return false;
    }

    public Task getTask(int id){
        return allTasks.get(id);
    }

    public ArrayList<Task> getTaskList(){
        return new ArrayList<Task>(tasks);
    }

    TaskManager(){
        allTasks = new HashMap<>();
        tasks = new ArrayList<>();
        subTasks = new ArrayList<>();
        epics = new ArrayList<>();
    }




    private int generateID(){
        int id;
        for (id = 0; id < Integer.MAX_VALUE && allTasks.containsKey(id); id++);
        return id;
    }
}
