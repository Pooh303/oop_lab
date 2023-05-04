package Week5;

public class Student {

    protected String id;
    protected String name;
    protected double gpa;

    public void setID(String i) {
        id = i;
    }

    public void setName(String n) {
        name = n;
    }

    public void setGPA(double g) {
        gpa = g;
    }

    public void showDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
    }
}
