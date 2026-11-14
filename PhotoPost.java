/** A photo post in the news feed. */
public class PhotoPost extends Post {
    private String filename;
    private String caption;

    public PhotoPost(String author, String filename, String caption) {
        super(author);
        this.filename = filename;
        this.caption = caption;
    }

    public String getImageFile() { return filename; }
    public String getCaption() { return caption; }

    // Question 5
    public void printShortSummary() {
        System.out.println("Photo post from " + getUserName());
    }

    // Questions 9-11 and 14: specialized display.
    @Override
    public void display() {
        System.out.println("Photo from " + getUserName() + ":");
        System.out.println(filename + " - " + caption);
        System.out.println(getDetails());
    }

    // Question 11
    public void displayWithSuper() {
        super.display();
        System.out.println(caption);
    }
}