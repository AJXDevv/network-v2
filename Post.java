import java.util.ArrayList;

/** Common information for every news-feed post. */
public class Post {
    private String username;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    public Post(String author) {
        username = author;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }

    // Question 4: inherited methods work in MessagePost and PhotoPost.
    public void like() { likes++; }
    public void unlike() { if (likes > 0) likes--; }
    public void addComment(String text) { comments.add(text); }
    public long getTimeStamp() { return timestamp; }

    // Question 5: public getter allows subclasses to get the author.
    public String getUserName() { return username; }

    // Questions 10 and 11: subclasses override this method and
    // may call super.display() for common post information.
    public void display() {
        System.out.println(username);
    }

    // Question 15: protected helpers let subclasses choose their layout.
    protected String getDetails() {
        long seconds = (System.currentTimeMillis() - timestamp) / 1000;
        long minutes = seconds / 60;
        String time = minutes > 0 ? minutes + " minutes ago" : seconds + " seconds ago";
        String reaction = likes == 0 ? "No likes." : likes + " like(s).";
        String commentText = comments.isEmpty() ? "No comments." :
                comments.size() + " comment(s).";
        return time + " - " + reaction + " " + commentText;
    }
}