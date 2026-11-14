import java.util.ArrayList;
/** Original network-v2 Post class (Barnes and Kölling). */
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
    public void like() { likes++; }
    public void unlike() { if(likes > 0) likes--; }
    public void addComment(String text) { comments.add(text); }
    public long getTimeStamp() { return timestamp; }
    public void display() {
        System.out.println(username);
        System.out.print(timeString(timestamp));
        if(likes > 0) System.out.println("  -  " + likes + " people like this.");
        else System.out.println();
        if(comments.isEmpty()) System.out.println("   No comments.");
        else System.out.println("   " + comments.size() + " comment(s). Click here to view.");
    }
    private String timeString(long time) {
        long seconds = (System.currentTimeMillis() - time) / 1000;
        long minutes = seconds / 60;
        return minutes > 0 ? minutes + " minutes ago" : seconds + " seconds ago";
    }
}