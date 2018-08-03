public class Node {
    private String name;
    private String desc;

    public Node() {}

    public Node(String name) {}

    public Node(String name, String description) {}

    public String elevatorPitch() {
        // String details = String.format("Project name: %s | Project description: %s", name, desc);
        return "Project name: " + name + " | " + "Project description: " + desc;
    }

}