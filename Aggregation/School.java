import java.util.List;

public class School {
    private List<Student> students;

    public School(List<Student> students) {
        this.students = students;
    }

    public void listStudents() {
        for (Student s : students) {
            System.out.println("Student ID: " + s.id);
        }
    }
}
