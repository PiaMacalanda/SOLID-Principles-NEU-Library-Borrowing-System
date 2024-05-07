public class Student {
  
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void borrowResource(LibraryResource resource) {
        System.out.println(name + " is borrowing: " + resource.getTitle());
        resource.checkOutResource();
    }

    // Getter for the student's name
    public String getName() {
        return name;
    }

    // Setter for the student's name
    public void setName(String name) {
        this.name = name;
    }
}
