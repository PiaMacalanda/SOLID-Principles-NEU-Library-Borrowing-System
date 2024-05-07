public class Journal extends AbstractResource {
  
    public Journal(String title) {
        super(title);
    }

    @Override
    public void checkOutResource() {
        System.out.println("Checking out journal: " + title);
        // Journal-specific checkout logic
    }

    @Override
    public String getTitle() {
        return title;
    }
}
