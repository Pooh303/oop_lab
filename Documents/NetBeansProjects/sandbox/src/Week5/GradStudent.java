package Week5;

public class GradStudent extends Student {

    private String thesisTitle;
    private String supervisor;

    public void setThesisTitle(String t) {
        thesisTitle = t;
    }

    public void setSupervisor(String s) {
        supervisor = s;
    }

    public void showThesis() {
        System.out.println("Title: " + thesisTitle);
        System.out.println("Supervisor: " + supervisor);
    }

    public void printMyName() {
        System.out.println("My name is: " + name);
    }

    public static void main(String[] args) {
        GradStudent n = new GradStudent();
        n.name = "John";
        n.printMyName();
    }
}
