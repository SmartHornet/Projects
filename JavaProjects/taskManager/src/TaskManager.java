import java.util.ArrayList;
import java.util.HashMap;

public class TaskManager {
    private HashMap<Integer, Task> tasks;
    private HashMap<Integer, Subtask> subTasks;
    private HashMap<Integer, Epic> epics;

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

    public boolean removeTask(int id){
        if(!tasks.containsKey(id)) return false;
        tasks.remove(id);
        return true;
    }

    public void removeAllTasks(){
        tasks.clear();
    }

/**********************************************************************************/


    public void createEpic(String name, String description){
        tasks.put(generateID(),new Task(name, description));
    }

    public boolean addEpic(Epic epic){
        if (epic != null){
            epics.put(generateID(),epic);
            return true;
        } else return false;
    }

    public boolean updateEpic(Epic epic, int id){
        if(!epics.containsKey(id)) return false;
        if (epic != null){
            tasks.replace(id,epic);
            return true;
        } else return false;
    }

    public Task getEpic(int id){
        return epics.get(id);
    }

    public HashMap<Integer, Epic> getEpics(){
        return new HashMap<Integer, Epic>(epics);
    }

    public boolean removeEpic(int id){
        if(!epics.containsKey(id)) return false;
        epics.remove(id);
        return true;
    }

    public void removeAllEpics(){
        epics.clear();
    }

    /**********************************************************************************/

    public boolean createSubtask(String name, String description, Epic epic){
        if (epic != null) {
            Subtask subTask = new Subtask(name, description);
            subTask.setEpic(epic);
            epic.addSubtask(subTask);
            subTasks.put(generateID(),subTask);
            return true;
        }else return false;
    }

    public boolean updateSubtask(Subtask subTask, int id){
        if(!subTasks.containsKey(id)) return false;
        Subtask oldSubtask = subTasks.get(id);
        Epic epic = oldSubtask.getEpic();
        epic.removeSubtask(oldSubtask);
        epic.addSubtask(subTask);
        subTasks.replace(id,subTask);
        subTask.setEpic(epic);
        return true;
    }

    public Task getTask(int id){
        return tasks.get(id);
    }

    public HashMap<Integer, Task> getTasks(){
        return new HashMap<Integer, Task>(tasks);
    }

    public boolean removeTask(int id){
        if(!tasks.containsKey(id)) return false;
        tasks.remove(id);
        return true;
    }

    public void removeAllTasks(){
        tasks.clear();
    }

    /**********************************************************************************/
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
