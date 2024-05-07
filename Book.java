public class Book extends AbstractResource {
  
    public Book(String title) {
        super(title);
    }

    @Override
    public void checkOutResource() {
        System.out.println("Checking out book: " + title);
        // Book-specific checkout logic
    }

    @Override
    public String getTitle() {
        return title;
    }
}
