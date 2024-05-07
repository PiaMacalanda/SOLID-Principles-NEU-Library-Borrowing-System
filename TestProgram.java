public class TestProgram {
  
    public static void main(String[] args) {
      
        Student student1 = new Student("Levi");
        LibraryResource book = new Book("OOP Book");
        student1.checkOutResource(book);

        Student student2 = new Student("Mikasa");
        LibraryResource journal = new Journal("SOLID Principles Journal");
        student2.checkOutResource(journal);
    }
}
