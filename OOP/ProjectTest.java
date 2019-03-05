public class ProjectTest {
    public static void main(String[] args) {

        Project t0 = new Project();
        Project t1 = new Project("Project x");
        Project t2 = new Project("Secret Project", "Build secret gift for secret recipient");

        t0.elevatorPitch();
        t1.elevatorPitch();
        t2.elevatorPitch();

        t0.getName();
        t0.setName("First Album");
        t1.setDesc("Wolverine!!");

        t0.elevatorPitch();
        t1.elevatorPitch();
    }
}