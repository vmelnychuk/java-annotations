package suppresswarnings;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private String title;
    private String text;
    private List<Comment> comments;

    public Post(String title, String text) {
        this.title = title;
        this.text = text;
        this.comments = new ArrayList<Comment>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
