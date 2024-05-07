public class Student {
  
    private String name;
    private String studentNumber;

    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public void borrowResource(LibraryResource resource) {
      
        System.out.println("Student Name: " + name);
        System.out.println("Student No: " + studentNumber);
        System.out.println("Title: " + resource.getTitle());
        System.out.println("Classification: " + resource.getClassification());
        resource.checkOutResource();
    }
