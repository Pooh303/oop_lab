package Week12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentModal {

    private Student student;
    private File file;

    public StudentModal() {
        file = new File("StudentM.dat");
        try {
            file.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Student load() {
        try {
            FileInputStream stream = new FileInputStream(file);
            ObjectInputStream outputStream = new ObjectInputStream(stream);
            student = (Student) outputStream.readObject();
            if (student == null) {
                student = new Student();
            }
            stream.close();
            outputStream.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return student;
    }

    public void save() {
        try {
            FileOutputStream stream = new FileOutputStream(file);
            ObjectOutputStream outputStream = new ObjectOutputStream(stream);
            outputStream.writeObject(student);
            stream.close();
            outputStream.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Student getStudent() {
        return student;
    }

}
