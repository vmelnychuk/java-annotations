package suppresswarnings;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Blog blog = new Blog();
        fillBlog(blog);
        System.out.println("How many posts to get? ");
        int numberOfPosts = Integer.parseInt(scanner.nextLine());
        List<Post> posts = blog.getLatestPosts(numberOfPosts);
        switch (numberOfPosts) {
            case 0:
                System.out.println("no posts");
                break;
            case 1:
                System.out.println(posts.get(0));
                break;
            default:
                for(Post post : posts) {
                    System.out.println(post);
                    System.out.println("=======");
                }
        }

    }

    public static void  fillBlog(Blog blog) {
        blog.addPost(new Post("Post 1", "Text 1"));
        blog.addPost(new Post("Post 2", "Text 2"));
        blog.addPost(new Post("Post 3", "Text 3"));
    }
}
