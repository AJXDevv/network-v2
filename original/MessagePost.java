/** Original network-v2 MessagePost class (Barnes and Kölling). */
public class MessagePost extends Post {
    private String message;
    public MessagePost(String author, String text) {
        super(author);
        message = text;
    }
    public String getText() { return message; }
}