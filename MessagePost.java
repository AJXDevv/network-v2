/** A text post in the news feed. */
public class MessagePost extends Post {
    private String message;

    public MessagePost(String author, String text) {
        super(author);
        message = text;
    }

    public String getText() { return message; }

    // Question 5: calling inherited getUserName needs no special syntax.
    public void printShortSummary() {
        System.out.println("Message post from " + getUserName());
    }

    // Questions 9-11, 14-15: override display to control output.
    @Override
    public void display() {
        System.out.println("Message from " + getUserName() + ":");
        System.out.println(message);
        System.out.println(getDetails());
    }

    // Question 11: alternative showing how super.display() can be used.
    public void displayWithSuper() {
        super.display();
        System.out.println(message);
    }
}