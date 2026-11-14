/** Question 7: a third kind of post. */
public class EventPost extends Post {
    private String eventName;
    private String location;

    public EventPost(String author, String eventName, String location) {
        super(author);
        this.eventName = eventName;
        this.location = location;
    }

    public String getEventName() { return eventName; }
    public String getLocation() { return location; }

    @Override
    public void display() {
        System.out.println("Event from " + getUserName() + ": " + eventName);
        System.out.println("Location: " + location);
        System.out.println(getDetails());
    }
}