public abstract class AbstractResource implements LibraryResource {
  
    protected String title;

    public AbstractResource(String title) {
        this.title = title;
    }

    @Override
    public abstract void checkOutResource();

    @Override
    public String getTitle() {
        return title;
    }
}
