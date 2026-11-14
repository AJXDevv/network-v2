/** Original network-v2 PhotoPost class (Barnes and Kölling). */
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
}