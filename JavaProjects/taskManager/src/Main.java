import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Task> tasks;


        TaskManager taskManager = new TaskManager();

        Task task = new Task("Задача 1", "описание задачи 1");

        taskManager.addTask(task);

        taskManager.createTask("Задача 2", "описание задачи 2");


        //tasks = taskManager.getTasks();
        System.out.println(taskManager.getTasks());

        taskManager.removeAll();

        System.out.println(taskManager.getTasks());

        taskManager.createTask("Задача 3", "описание задачи 3");

        System.out.println(taskManager.getTasks());
        //System.out.println(taskManager.getTasks());

        //System.out.println(task);

    }
}