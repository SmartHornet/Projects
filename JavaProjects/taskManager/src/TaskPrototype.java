public class TaskPrototype {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    TaskPrototype (String name, String description){
        this.name = name;
        this.description = description;
    }

    TaskPrototype (){}
}

