import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Task> tasks;


        TaskManager taskManager = new TaskManager();

        Task task = new Task("Задача 1", "описание задачи 1");
        taskManager.addTask(task);
        taskManager.createTask("Задача 2", "описание задачи 2");

        for(int i: taskManager.getTasks().keySet()){
            System.out.println("ID: "+i+" "+taskManager.getTasks().get(i));
        }

        /*taskManager.removeTask(1);

        for(int i: taskManager.getTasks().keySet()){
            System.out.println("ID: "+i+" "+taskManager.getTasks().get(i));
        }*/


        Epic epic = new Epic("Эпик 1", "описание эпика 1");
        taskManager.addEpic(epic);
        taskManager.createEpic("Эпик 2", "описание эпика 2");

        for(int i: taskManager.getEpics().keySet()){
            System.out.println("ID: "+i+" "+taskManager.getEpics().get(i)+" status: "+taskManager.getEpics().get(i).getStatus());
        }

        taskManager.createSubtask("Подзадача 1", "описание подзадачи 1",epic);



        for(int i: taskManager.getSubtasks().keySet()){
            System.out.println("ID: "+i+" "+taskManager.getSubtasks().get(i)+" status: "+taskManager.getSubtasks().get(i).getStatus());
        }

        System.out.println();

        Subtask subtask = new Subtask("Подзадача 2", "описание подзадачи 2");
        taskManager.updateSubtask(subtask,4);

        for(int i: taskManager.getSubtasks().keySet()){
            System.out.println("ID: "+i+" "+taskManager.getSubtasks().get(i)+" status: "+taskManager.getSubtasks().get(i).getStatus());
        }

        System.out.println(epic.getSubtask());

    }
}