public class Task {
    private String name;
    private String description;
    int status;

    public static final int NEW = 0;
    public static final int DONE = 1;
    public static final int IN_PROGRESS = 2;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    Task(String name, String description){
        this.name = name;
        this.description = description;
        status = NEW;
    }

    Task(){
        status = NEW;
    }
}

