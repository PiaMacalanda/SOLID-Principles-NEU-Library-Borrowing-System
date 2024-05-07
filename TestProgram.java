public class TestProgram {
  
    public static void main(String[] args) {
      
        Student student = new Student("Himiko Toga", "123456789");
        LibraryResource book = new Book("OOP Book");
        student.borrowResource(book);

        Student student = new Student("Shoto Todoroki", "123455555");
        LibraryResource journal = new Journal("SOLID Principles Journal");
        student.borrowResource(journal);

    }
}
