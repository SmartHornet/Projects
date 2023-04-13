

public class Main {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();

        Task task = new Task("Задача 1", "описание задачи 1");

        taskManager.addTask(task);
        taskManager.createTask("Задача 2", "описание задачи 2");

        System.out.println(taskManager.getTaskList());

        //System.out.println(task);

    }
}