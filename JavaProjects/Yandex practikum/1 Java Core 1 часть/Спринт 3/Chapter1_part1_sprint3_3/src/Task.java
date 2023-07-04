public class Task {

    private TaskPriority taskPriority;
    private String description;

    Task (TaskPriority taskPriority1, String description){
        this.description = description;
        taskPriority = taskPriority1;
    }

    public TaskPriority getTaskPriority() {
        return taskPriority;
    }

    public String getDescription() {
        return description;
    }
}
