
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Realization
        Smartphone phone = new Smartphone("Galaxy S25");
        phone.turnOn();

        // Inheritance
        Student student = new Student(1001);
        System.out.println("Student ID: " + student.id);

        // Association
        Library lib = new Library("Central Library");
        StudentWithLibrary swl = new StudentWithLibrary(1002, lib);
        swl.printLibraryName();

        // Aggregation
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(swl);
        School school = new School(studentList);
        school.listStudents();

        // Composition
        Book book1 = new Book("Design Patterns");
        Book book2 = new Book("Clean Code");
        LibraryWithBooks libraryWithBooks = new LibraryWithBooks(Arrays.asList(book1, book2));
        libraryWithBooks.listBooks();

        // Dependency
        Printer printer = new Printer();
        printer.printBook(book1);
    }
}
