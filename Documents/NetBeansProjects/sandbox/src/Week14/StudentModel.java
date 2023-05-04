package Week14;

public class StudentModel {

    private String rollNo;
    private String name;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//
//import java.io.*;
//
//public class StudentModel {
//
//    private Student data;
//
//    public StudentModel() {
//        data = new Student("", "", 0);
//    }
//
//    public boolean loadData() {
//        File f = new File("dataStudent.dat");
//        if (f.exists()) {
//            try (FileInputStream fin = new FileInputStream("dataStudent.dat"); ObjectInputStream in = new ObjectInputStream(fin);) {
//                data = (Student) in.readObject();
//                return true;
//            } catch (Exception i) {
//                return false;
//            }
//        }
//        return false;
//    }
//
//    public boolean saveData() {
//        try (FileOutputStream fOut = new FileOutputStream("dataStudent.dat"); ObjectOutputStream oout = new ObjectOutputStream(fOut);) {
//            oout.writeObject(data);
//            return true;
//        } catch (Exception i) {
//            return false;
//        }
//    }
//
//    public Student getData() {
//        return data;
//    }
//
//    public void setData(Student data) {
//        this.data = data;
//    }
//}
