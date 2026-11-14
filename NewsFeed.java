import java.util.ArrayList;

/** Stores posts of any subclass of Post. */
public class NewsFeed {
    private ArrayList<Post> posts;

    public NewsFeed() {
        posts = new ArrayList<>();
    }

    // Questions 1-4 and 8: all Post subclasses work without changing NewsFeed.
    public void addPost(Post post) {
        posts.add(post);
    }

    // Questions 9-11: dynamic method lookup calls the correct display().
    public void show() {
        for (Post post : posts) {
            post.display();
            System.out.println();
        }
    }
}