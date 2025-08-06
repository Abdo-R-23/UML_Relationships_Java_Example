public class StudentWithLibrary extends Student {
    private Library library;

    public StudentWithLibrary(int id, Library library) {
        super(id);
        this.library = library;
    }

    public void printLibraryName() {
        System.out.println("Library: " + library.getLibraryName());
    }
}
