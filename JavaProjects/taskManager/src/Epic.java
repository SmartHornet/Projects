import java.util.ArrayList;
import java.util.HashMap;

public class Epic extends Task{
    private ArrayList<Subtask> subtasks;

    Epic(Epic ob){
        super(ob.getName(), ob.getDescription());
        subtasks = new ArrayList<>();
    }

    Epic(String name, String description){
        super(name, description);
        subtasks = new ArrayList<>();
    }

    int getStatus(){
        if(subtasks.size() == 0) return Subtask.NEW;

        boolean statusNEW = true, statusDONE = true;
        for(Subtask i: subtasks){
            if(i.getStatus() != Subtask.DONE) statusDONE = false;
            if(i.getStatus() != Subtask.NEW) statusNEW = false;
        }
        if(statusNEW) return Subtask.NEW;
        else if(statusDONE) return Subtask.DONE;
            else return Subtask.IN_PROGRESS;
    }

    public void addSubtask(Subtask subtask){
        subtasks.add(subtask);
        subtask.setEpic(this);
    }

    public ArrayList<Subtask> getSubtask(){
        return new ArrayList<Subtask>(subtasks);
    }

    public void removeSubtask(Subtask subtask){
        subtasks.remove(subtask);
    }

    public void removeAllSubtask(){
        subtasks.clear();
    }
}
