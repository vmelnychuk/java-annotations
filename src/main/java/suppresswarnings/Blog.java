package suppresswarnings;

import java.util.LinkedList;
import java.util.List;

public class Blog {
    List<Post> posts;

    public Blog() {
        this.posts = new LinkedList<Post>();
    }

    public List<Post> getLatestPosts(int size) {
        if (size > posts.size()) {
            size = posts.size();
        } else if(size == 0) {
            return null;
        }
        return posts.subList(0, size);
    }

    public void addPost(Post post) {
        posts.add(0, post);
    }
}
