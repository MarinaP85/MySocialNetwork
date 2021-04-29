import java.awt.image.BufferedImage;

public class Message {
    private final User user;
    private final String text;
    private final BufferedImage image;
    private int likes;

    public Message(User user, String text, BufferedImage image) {
        this.user = user;
        this.text = text;
        this.image = image;
    }

    public User getUser() {
        return user;
    }

    public String getText() {
        return text;
    }

    public BufferedImage getImage() {
        return image;
    }

    public int getLikes() {
        return likes;
    }

    public void addLike() {
        this.likes++;
    }
}
