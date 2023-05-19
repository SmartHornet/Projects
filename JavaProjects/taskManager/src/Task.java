public class Task {
    private String name;
    private String description;


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    Task(String name, String description){
        this.name = name;
        this.description = description;

    }

    Task(Task ob){
        name = ob.getName();
        description = ob.getDescription();
    }
    //Task(){}

    @Override
    public String toString() {
        return "name: "+name+" description: "+description;
    }
}

