public class Project {
    private String name;
    private String description;

    // constructor methods (overloaded)
    public Project() {
        this.name = "unnamed project";
        this.description = "none";
    }
    public Project(String name) {
        this.name = name;
        this.description = "none";
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void elevatorPitch() {
        System.out.println("Project: " + this.name);
        System.out.println("Description: " + this.description);
    }

    // getters + setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return this.description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }
}