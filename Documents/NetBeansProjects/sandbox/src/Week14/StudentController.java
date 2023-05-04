package Week14;

public class StudentController {

    private StudentModel model;
    private StudentView view;

    public StudentController() {
        model = new StudentModel();
        view = new StudentView();
        this.updateView();
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void updateView() {
        view.printDetails(model.getName(), model.getRollNo());
    }
}
